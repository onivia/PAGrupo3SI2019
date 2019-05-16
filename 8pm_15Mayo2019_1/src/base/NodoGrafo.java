package base;

public class NodoGrafo {
	public String label;
	public int peso;
	public int pesoAcumulado;
	public int cantArcos;
	public NodoGrafo arco;
	public NodoGrafo vertice;

	public NodoGrafo(String label, int peso) {
		this.label = label;
		this.peso = peso;
		this.pesoAcumulado = 0;
		this.cantArcos = 0;
		this.arco = null;
		this.vertice = null;
	}
	
	public NodoGrafo(String label) {
		this.label = label;
		this.peso = 0;
		this.pesoAcumulado = 0;
		this.cantArcos = 0;
		this.arco = null;
		this.vertice = null;
	}
}
