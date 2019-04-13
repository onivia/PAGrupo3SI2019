package principal;

public class Programa {
	public static void main(String[] args) {
		Estudiante e1 = new Estudiante(100, "yo100", "A");
		Estudiante e2 = e1;
		e1.codigo = 200;
		String s1 = new String("100");
		String s2 = s1;
		s1 = String.valueOf(500);
		System.out.println(s1); //luisa-"500"; gilbert-"500"
		System.out.println(s2); //luisa-"500"; g-"500"
	}
}
