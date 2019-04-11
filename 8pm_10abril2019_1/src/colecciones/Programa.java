package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		pruebaArrayList();
	}
	
	public static void pruebaArrayList() {
		List<Estudiante> arraylist = new ArrayList<Estudiante>();
		Estudiante e = null;
		
		e = new Estudiante(100, "yo100", "A");
		System.out.println(e.hashCode());
		arraylist.add(e);
		e = new Estudiante(200, "yo200", "B");
		System.out.println(e.hashCode());
		arraylist.add(e);
		
		Estudiante e2 = new Estudiante(200, "yo200", "B");
		System.out.println(e2.hashCode());
		//arraylist.remove(e2);		
		
		for(Estudiante estudent : arraylist) {
			arraylist.remove(estudent);			
		}
	}
}
