package prueba;

import base.MiGrafo;

public class Programa {

	public static void main(String[] args) {
		prueba_ArmarGrafo();
	}
	
	public static void prueba_ArmarGrafo() {
		MiGrafo grafo = new MiGrafo();
		
		grafo.adicionarVertice("A", "B", 2);
		grafo.adicionarVertice("A", "C", 2);
		grafo.adicionarVertice("B", "D", 3);
		grafo.adicionarVertice("C", "D", 1);
		grafo.adicionarVertice("D", null, 0);
		
		//grafo.mostrarVertices();
		grafo.mostrarArcos("A");
	}
}
