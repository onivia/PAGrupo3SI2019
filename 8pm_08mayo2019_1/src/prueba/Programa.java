package prueba;

import base.MiArbolBinBusqueda;
import base.NodoArbol;

public class Programa {

	public static void main(String[] args) throws Exception {
		prueba_MiArbolBinBusqueda();
	}
	
	public static void prueba_MiArbolBinBusqueda() throws Exception {
		MiArbolBinBusqueda arbol = new MiArbolBinBusqueda();
		
		arbol.insertar(new NodoArbol(50));
		arbol.insertar(new NodoArbol(10));
		arbol.insertar(new NodoArbol(40));
		arbol.insertar(new NodoArbol(70));
		arbol.insertar(new NodoArbol(90));
		arbol.insertar(new NodoArbol(110));
		arbol.insertar(new NodoArbol(0));
		
		//arbol.recorrerAmplitud();
		arbol.recorrerPreorden();
	}
}
