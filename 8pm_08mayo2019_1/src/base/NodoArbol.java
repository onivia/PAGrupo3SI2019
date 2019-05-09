package base;

public class NodoArbol {
	public int dato;
	public NodoArbol izq;
	public NodoArbol der;

	public NodoArbol(int dato) {
		this.dato = dato;
		this.izq = null;
		this.der = null;
	}
}
