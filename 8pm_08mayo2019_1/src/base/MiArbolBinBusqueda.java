package base;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MiArbolBinBusqueda {
	public NodoArbol raiz;
	
	public MiArbolBinBusqueda() {
		this.raiz = null;
	}
	
	public void insertar(NodoArbol nodo) throws Exception {
		NodoArbol nodoAux = null;
		if(nodo!=null) {
			if(raiz==null) {
				raiz = nodo;
			} else {
				nodoAux = raiz;
				while(true) {
					if(nodo.dato<nodoAux.dato) {
						if(nodoAux.izq!=null) {
							nodoAux = nodoAux.izq;							
						} else {
							nodoAux.izq = nodo;
							break;
						}
					} else if(nodo.dato>nodoAux.dato) {
						if(nodoAux.der!=null) {
							nodoAux = nodoAux.der;							
						} else {
							nodoAux.der = nodo;
							break;
						}
					} else {
						throw new Exception("el dato ya existe! dato:" + nodo.dato);
					}
				}
			}
		}
	}

	public void recorrerAmplitud() {
		/*
		 * 1. encolar la raiz
		 * 2. en un ciclo evaluar si la cola tiene elementos
		 * 3.	ubicar a nA en el nodo desencolado
		 * 4.	mostrar el dato del nA
		 * 5. 	si nA tiene hijo x izq, lo encolo
		 * 6. 	si nA tiene hijo x der, lo encolo
		 */
		Queue<NodoArbol> cola = null;
		NodoArbol nodoAux = null;
		
		if(raiz!=null) {
			cola = new LinkedList<NodoArbol>();
			//1.
			cola.add(raiz);
			//2.
			while(!cola.isEmpty()) {
				//3.
				nodoAux = cola.poll();
				//4.
				System.out.println(nodoAux.dato);
				//5.
				if(nodoAux.izq!=null) {
					cola.add(nodoAux.izq);					
				}
				//6.
				if(nodoAux.der!=null) {
					cola.add(nodoAux.der);					
				}
			}
		}		
	}

	public void recorrerPreorden() {
		/*
		 * ubicar a nA en raiz
		 * en un ciclo, siempre y nA!=null
		 * 		Si, nA.izq==null && nA.der!=null
		 * 			mostrar el dato nA
		 * 			mover nA a la der
		 * 		Si-no, Si, nA.izq!=null && nA.der==null
		 * 			mostrar el dato nA
		 * 			mover nA a la izq 			
		 * 		Si-no, Si, nA.izq!=null && nA.der!=null
		 * 			mostrar el dato nA
		 * 			apilar a nA.der
		 * 			mover nA a la izq
		 * 		Si, nA.izq==null && nA.der==null (hoja)
		 * 			mostrar el dato nA
		 * 			Si, pila no esta vacia
		 * 				ubico a nA en el nodo desapilado
		 * 			Si-no
		 * 				nA lo igualo a null
		 */
		NodoArbol nodoAux = null;
		Stack<NodoArbol> pila = null;
		
		if(raiz!=null) {
			pila = new Stack<NodoArbol>();			
			nodoAux = raiz;
			while(nodoAux!=null) {
				if(nodoAux.izq==null && nodoAux.der!=null) {
					System.out.println(nodoAux.dato);
					nodoAux = nodoAux.der;					
				} else if(nodoAux.izq!=null && nodoAux.der==null) {
					System.out.println(nodoAux.dato);
					nodoAux = nodoAux.izq;
					
				} else if(nodoAux.izq!=null && nodoAux.der!=null) {
					System.out.println(nodoAux.dato);
					pila.push(nodoAux.der);
					nodoAux = nodoAux.izq;
				}
				
				if(nodoAux.izq==null && nodoAux.der==null) {
					System.out.println(nodoAux.dato);
					if(!pila.isEmpty())
						nodoAux = pila.pop();
					else
						nodoAux = null;
				}
			}
		}
	}
}
