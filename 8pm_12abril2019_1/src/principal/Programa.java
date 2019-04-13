package principal;

final public class Programa {
	public static void main(String[] args) {
		Estudiante e1 = new Estudiante(100, "yo100", "A");
		//Estudiante e2 = (Estudiante)e1.clone();
		m1(e1);
		System.out.println(e1);
	}
	
	final public static void m1(Estudiante e) {
		//e = new Estudiante(100, "yo100", "A");
		e = new Estudiante(100, "yo100", "A");
		e.codigo = 200;
	}
}
