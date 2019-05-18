package base;

public class MiTecnicaHash {
	private int T;
	public Nodo[] nodos;

	public MiTecnicaHash(int T) {
		this.T = T;
		this.nodos = new Nodo[T + 10];
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
		kT = obtenerKt(String.valueOf(est.codigo), 2);
		
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
				posi = explorarSecuecialmente(nodo,I);				
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
	
	private int explorarSecuecialmente(Nodo nodo, int posi) {
		boolean fueInsertado = false;
		int posiInsercion = 0;
		
		for (int i = posi; i < nodos.length; i++) {
			if(nodos[i]==null) {
				nodos[i]= nodo;
				fueInsertado = true;
				posiInsercion = i;
			}
		}
		if(posi > 0 && !fueInsertado) {
			for (int i = 0; i < posi; i++) {
				if(nodos[i]==null) {
					nodos[i]= nodo;
					fueInsertado = true;
					posiInsercion = i;
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
		kT = kT.substring(kT.length() - cantMaxCifras);
		
		return (Integer.parseInt(kT));
	}
}
