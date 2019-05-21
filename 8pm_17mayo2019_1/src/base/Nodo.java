package base;

public class Nodo {
	public Estudiante dato;
	private int kT;
	private int I;	

	public Nodo(Estudiante est, int kT, int I) {
		this.dato = est;
		this.kT = kT;
		this.I = I;
	}
	
	public Nodo(Estudiante est) {
		this.dato = est;
		this.kT = 0;
		this.I = 0;
	}

	@Override
	public boolean equals(Object obj) {
		Nodo otroNodo = null;
		boolean resultado = false;
		
		if(obj instanceof Nodo) {
			otroNodo = (Nodo)obj;
			if(this.dato.toString().equals(otroNodo.dato.toString())
			   && this.kT==otroNodo.kT && this.I==otroNodo.I) {
				resultado = true;
			}
		}
		
		return resultado;
	}
}
