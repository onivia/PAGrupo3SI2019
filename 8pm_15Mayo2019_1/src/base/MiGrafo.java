package base;

public class MiGrafo {
	private NodoGrafo pVertice;
	private NodoGrafo uVertice;
	public int cantVertices;
	private NodoMemorizacion rutasMemorizadas[];

	public MiGrafo() {
		this.pVertice = null;
		this.uVertice = null;
		this.cantVertices = 0;
		this.rutasMemorizadas = new NodoMemorizacion[0];
	}
	
	public void adicionarVertice(String labelOrigen, String labelDestino, int peso) {
		/*
		 * 1.	Obtener vertice a partir 'labelOrigen'
		 * 2.	Si vertice = null
		 * 3.		adiciono vertice y obtenego la referencia
		 * 4.	Si labelDestino != null
		 * 5.		Obtener arco a partir del vertice
		 * 6.		Si arco = null
		 * 7.			adiciono arco
		 */
		NodoGrafo vertice = null;
		NodoGrafo arco = null;
		
		//1.
		vertice = obtenerVerticeAdyacente(labelOrigen);
		if(vertice==null) { //2.
			//3.
			vertice = adicionarVerticeAdyacente(labelOrigen);			
		}		
		if(labelDestino!=null) { //4.
			//5.
			arco = obtenerArco(vertice, labelDestino);
			if(arco==null) { //6.
				//7.
				adicionarArco(vertice, labelDestino, peso);				
			}
		}
		
	}
	
	private NodoGrafo obtenerVerticeAdyacente(String label) { //OK
		NodoGrafo nodoAux = null;
		
		if(pVertice!=null) {
			nodoAux = pVertice;
			while(nodoAux!=null) {
				if(nodoAux.label.equals(label))
					break;
				nodoAux = nodoAux.vertice;
			}
		}
		
		return nodoAux;
	}
	
	private NodoGrafo adicionarVerticeAdyacente(String label) { //OK
		NodoGrafo nodo = null;
		
		nodo = new NodoGrafo(label);
		if(pVertice==null) {
			pVertice = nodo;
			uVertice = nodo;
		} else {
			uVertice.vertice = nodo;
			uVertice = nodo;
		}
		cantVertices++;
		
		return nodo;
	}
	
	private NodoGrafo obtenerArco(NodoGrafo vertice, String label) {
		NodoGrafo nodoAux = null;
		
		if(vertice.arco!=null) {
			nodoAux = vertice.arco;
			while(nodoAux!=null) {
				if(nodoAux.label.equals(label))
					break;
				nodoAux = nodoAux.arco;
			}			
		}
		
		return nodoAux;
	}
	
	private void adicionarArco(NodoGrafo vertice, String label, int peso) {
		NodoGrafo nodoAux = null;
		NodoGrafo nodo = null;
		
		nodo = new NodoGrafo(label, peso);
		nodoAux = obtenerUltimoArco(vertice);
		if(nodoAux==null) {
			vertice.arco = nodo;			
		} else {
			nodoAux.arco = nodo;			
		}
	}
	
	private NodoGrafo obtenerUltimoArco(NodoGrafo vertice) {
		NodoGrafo nodoAux = null;
		
		nodoAux = vertice.arco;
		if(nodoAux!=null) {
			while(nodoAux.arco!=null)
				nodoAux = nodoAux.arco;			
		}
		
		return nodoAux;
	}
	
	public void mostrarVertices() {
		NodoGrafo nodoAux = null;
		
		nodoAux = pVertice;
		if(nodoAux!=null) {
			while(nodoAux!=null) {
				System.out.println(nodoAux.label);
				nodoAux = nodoAux.vertice;
			}
		}
	}
	
	public void mostrarArcos(String labelVertice) {
		NodoGrafo nodoAux = null;
		NodoGrafo vertice = null;
		
		vertice = obtenerVerticeAdyacente(labelVertice);		
		if(vertice!=null && vertice.arco!=null) {
			nodoAux = vertice.arco;
			while(nodoAux!=null) {
				System.out.println(nodoAux.label);
				nodoAux = nodoAux.arco;
			}			
		}		
	}
	
	public void mostrarRutaMasCorta() {		
	}
	
	public void mostrarRutaCritica() {		
	}
	
	private void ordenarRutasMemorizadas() {		
	}
}
