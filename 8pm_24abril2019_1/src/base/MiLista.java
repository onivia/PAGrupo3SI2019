package base;

public class MiLista {
	private Nodo p;
	private Nodo u;
	public int tamano;
	
	public MiLista() {
		this.p = null;
		this.u = null;
		this.tamano = 0;
	}
	
	boolean estaVacia() {
		return (p==null && u==null);
	}
	
	Nodo obtenerNodoxPosicion(int posi) {
		Nodo nodoAux = null;
		
		if(!estaVacia() && posi>=0 && posi<tamano) {
			nodoAux = p;
			for(int i=1;i<=posi;i++) {
				nodoAux = nodoAux.sgte;				
			}
		}
		return nodoAux;		
	}
	
	Nodo obtenerPrimero() {
		return obtenerNodoxPosicion(0);
	}
	
	void insertarNodoxPosicion(Nodo nodo, int posi) throws Exception {
		Nodo nodoAux = null;
		
		if(estaVacia() && posi==0) {
			p = nodo;
			u = nodo;
			tamano++;
		} else if(!estaVacia() && posi==0) {
			nodo.sgte = p;
			p = nodo;
			tamano++;
		} else if(!estaVacia() && posi==tamano) {
			u.sgte = nodo;
			u = nodo;
			tamano++;
		} else if(!estaVacia() && (posi>0 && posi<tamano)) {
			nodoAux = obtenerNodoxPosicion(posi - 1);
			nodo.sgte = nodoAux.sgte;
			nodoAux.sgte = nodo;
			tamano++;
		} else {
			throw new Exception("posi:" + posi + " NO existe!");
		}
	}
	
	void insertarPrimero(Nodo nodo) throws Exception {
		insertarNodoxPosicion(nodo, 0);		
	}
	
	void adicionar(Nodo nodo) throws Exception {
		insertarNodoxPosicion(nodo, tamano);
	}
	
	void removerPrimero() {
		Nodo nodoAux = null;
		
		if(!estaVacia()) {
			if(tamano==1) {
				p = null;
				u = null;				
			} else {
				nodoAux = p;
				p = p.sgte;
				nodoAux.sgte = null;				
			}
			tamano--;
		}
	}
	
	Nodo obteneryRemoverPrimero() {
		Nodo nodo = null;
		
		if(!estaVacia()) {
			nodo = new Nodo(p.dato);
			removerPrimero();
		}
		
		return nodo;
	}
	
	void mostrarLista() {
		Nodo nodoAux = null;
		
		if(!estaVacia()) {
			nodoAux = p;
			for(int i=0;i<tamano;i++) {
				System.out.println(nodoAux.dato);
				nodoAux = nodoAux.sgte;				
			}
		}
	}
}
