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
	
	public boolean estaVacia() {
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
	
	void insertarNodoxPosicion(Nodo nodo, int posi) {
		
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
