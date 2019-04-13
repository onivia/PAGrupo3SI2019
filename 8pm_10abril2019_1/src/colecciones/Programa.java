package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {
		//pruebaArrayList();
		//pruebaHashSet();
		pruebaHashMap();
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

	public static void pruebaHashSet() {
		Set<Estudiante> set = new HashSet<Estudiante>();
		boolean adiciono = false;
		
		adiciono = set.add(new Estudiante(100, "yo100", "A","1"));
		//System.out.println(adiciono);
		adiciono = set.add(new Estudiante(200, "yo200", "B","2"));
		//System.out.println(adiciono);
		adiciono = set.add(new Estudiante(100, "yo100", "A","3458934534957"));
		//System.out.println(adiciono);
		
		//set.remove(new Estudiante(100, "yo100", "A","34i5h34felfej"));
		
		System.out.println(set.contains(new Estudiante(100, "yo100", "A","XXXXXXXX")));
		
//		for(Estudiante e : set) {
//			System.out.println(e);
//		}
	}
	
	public static void pruebaHashMap() {
		Map<Integer,Estudiante> map = new HashMap<Integer,Estudiante>();
		map.put(100, new Estudiante(100, "yo100", "A","1"));
		map.put(200, new Estudiante(200, "yo200", "B","2"));
		map.put(300, new Estudiante(300, "yo300", "Z","XXXXXXX"));
		
		//System.out.println(map.size());
		//System.out.println(map.get(200));
		//map.remove(200,new Estudiante(200, "yo300", "B","2"));
		for(Map.Entry<Integer, Estudiante> obj : map.entrySet()) {
			System.out.println("key: " + obj.getKey() + "-value: " + obj.getValue());			
		}
	}	
}
