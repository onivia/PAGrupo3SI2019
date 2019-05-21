package base;

public class MiTecnicaHash {
	private int T;
	public Nodo[] nodos;
	private int cantMaxCifras;

	public MiTecnicaHash(int T) {
		this.T = T;
		this.nodos = new Nodo[T + 10];
		this.cantMaxCifras = 5;
	}
	
	public Estudiante obtener(int codigoEstudiante) {
		/* 
		 * 1. Se construye objeto tipo Nodo con solo el codigo del Estudiante
		 * 2. obtener Kt (donde la keyOriginal es el codigo del Estudiante)
		 * 3. obtener I Lineal
		 * 4. Si 'esNodo'!=null en la posi 'I'
		 * 5. 	se asigna en un objeto Estudiante el dato obtenido en el objeto nodo
		 * 6. Si-no, Si 'esNodo'!=null en la posi 'I^2'
		 * 7.		se asigna en un objeto Estudiante el dato obtenido en el objeto nodo
		 * 8. Si-no, Si 'exploracionSecuencial'!=null a partir de la posi 'I^2'
		 * 9.	se asigna en un objeto Estudiante el dato obtenido en el objeto nodo
		 * 10. Se retorna el objeto Estudiante
		 */
		Nodo nodo = null;
		Nodo nodoAux = null;
		Estudiante est = null;
		int I = 0;
		int kT = 0;
		
		nodo = new Nodo(new Estudiante(codigoEstudiante));
		kT = obtenerKt(String.valueOf(codigoEstudiante), cantMaxCifras);
		I = obtenerILineal(kT);
		nodoAux = esNodo(nodo, I);
		if(nodoAux!=null) {
			est = nodoAux.dato;			
		} else {
			I = obtenerICuadratico(I);
			nodoAux = esNodo(nodo, I);
			if(nodoAux!=null) {
				est = nodoAux.dato;			
			} else {
				nodoAux = exploracionSecuencial(nodo, I);
				if(nodoAux!=null) {
					est = nodoAux.dato;			
				}
			}
		}
		
		return est; //OJO! aqui retornan la instancia de tipo Estudiante
	}
	
	public int insertar(Estudiante est) {
		/*
		 * 1. obtengo Kt
		 * 2. obtengo I Lineal
		 * 3. Si la posicion I en el arreglo esta ocupada por otra instancia
		 * 4. 	obtengo I Cuadratica
		 * 5. 	Si la posicion I2 en el arreglo esta ocupada por otra instancia
		 * 6.		hago exploracion secuencial
		 */		
		int kT = 0;
		int I = 0;
		Nodo nodo = null;
		int posi = 0;
		
		//1.
		kT = obtenerKt(String.valueOf(est.codigo), cantMaxCifras);
		
		//2.
		I = obtenerILineal(kT);
		
		nodo = new Nodo(est, kT, I);
		
		//3.
		if(estaOcupadaPsicion(nodo,I)) {
			//4.
			I = obtenerICuadratico(I);
			//5.
			if(estaOcupadaPsicion(nodo,I)) {
				//6.
				posi = explorarSecuencialmente(nodo,I);				
			} else {
				insertarPosi(nodo, I);
				posi = I;
			}
		} else {
			insertarPosi(nodo, I);
			posi = I;			
		}
		
		return posi;
	}
	
	private void insertarPosi(Nodo nodo, int posi) {
		nodos[posi] = nodo;				
	}
	
	private Nodo esNodo(Nodo nodo, int posi) {
		Nodo nodoAux = null;
		
		if(posi < T && nodo!=null && nodo.dato!=null) {
			nodoAux = nodos[posi];
			if(nodoAux!=null && nodoAux.dato!=null && nodoAux.dato.codigo==nodo.dato.codigo)
				return nodoAux;				
		}
		
		return nodoAux;
	}
	
	private Nodo exploracionSecuencial(Nodo nodo, int posi) {
		Nodo nodoAux = null;
		boolean fueEncontrado = false;
		
		for (int i = posi; i < nodos.length; i++) {
			nodoAux=esNodo(nodo, i);
			if(nodoAux!=null) {
				fueEncontrado = true;
				break;				
			}		
		}
		if(posi > 0 && !fueEncontrado) {
			for (int i = 0; i < posi; i++) {
				nodoAux=esNodo(nodo, i);
				if(nodoAux!=null) {
					fueEncontrado = true;
					break;				
				}			
			}
		}
		
		return nodoAux;
	}
	
	private int explorarSecuencialmente(Nodo nodo, int posi) {
		boolean fueInsertado = false;
		int posiInsercion = 0;
		
		for (int i = posi; i < nodos.length; i++) {
			if(nodos[i]==null) {
				nodos[i]= nodo;
				fueInsertado = true;
				posiInsercion = i;
				break;
			}
		}
		if(posi > 0 && !fueInsertado) {
			for (int i = 0; i < posi; i++) {
				if(nodos[i]==null) {
					nodos[i]= nodo;
					fueInsertado = true;
					posiInsercion = i;
					break;
				}
			}			
		}
		
		return posiInsercion;
	}
	
	private boolean estaOcupadaPsicion(Nodo nodo, int posi) {
		boolean estaOcupada = true;
		
		if(posi<T) {
			if(nodos[posi]==null || (nodos[posi]!=null && nodos[posi].equals(nodo))) {
				estaOcupada = false;
			}
		}
		
		return estaOcupada;
	}
	
	private int obtenerICuadratico(int I) {
		return (((int)Math.pow(I, 2)) % T);		
	}
	
	private int obtenerILineal(int kT) {
		return (kT % T);		
	}
	
	private int obtenerKt(String keyOriginal, int cantMaxCifras) {
		String kT = "";
		
		kT = String.valueOf(keyOriginal.hashCode());
		if(kT.length() >= cantMaxCifras)
			kT = kT.substring(kT.length() - cantMaxCifras);
		
		return (Integer.parseInt(kT));
	}
}
