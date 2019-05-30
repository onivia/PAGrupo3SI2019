package principal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Programa {

	public static void main(String[] args) {
		//ejemplo_Optional();
		//ejemplo_ProgFuncional1();
		//ejemplo_ProgFuncional2();
		ejemplo_ProgFuncional3();
	}
	
	public static void ejemplo_ProgFuncional3() {
		List<Estudiante> ests = Arrays.asList(new Estudiante(100, "juan"),new Estudiante(20, "jose"),new Estudiante(50, "sorocaima"));
		
		//ests.forEach(o -> System.out.println(o));
		ests.stream()
			.filter(o -> o.codigo.equals(100))
			.forEach(o -> o.nombre="juanita");
		ests
			.forEach(System.out::println);
		
		/*
		for(Estudiante e : ests) {
			if(e.codigo==100) {
				e.nombre="juanita";
			}
			System.out.println(e);
		}
		*/
		
		/*
		for(Estudiante e : ests) {
			System.out.println(e);
		}*/		
	}
	
	public static void ejemplo_ProgFuncional2() {
		Operable obj = (int n1,int n2)-> n1-n2;
		System.out.println(obj.operacion(10, 20));		
	}
	
	public static void ejemplo_ProgFuncional1() {
		//(parametros)->(expresion o las instrucciones)
		imprimir(Programa::lambda, "mmhhh vea ps!");
		/*
		Imprimible obj = new Imprimible() {			
			@Override
			public void imprimir(String msj) {
				System.out.println(msj);
			}
		};
		obj.imprimir("si me estan entendiendo?");
		*/
	}
	
	public static void imprimir(Imprimible obj, String msj) {
		obj.imprimir(msj);
	}
	
	public static void lambda(String o) {
		System.out.println(o);		
	}
	
	public static void ejemplo_Optional() {
		Optional<String> cadena = null;
		
		cadena = obtieneMsj(1);
		System.out.println(cadena.orElse("parametro invalido!").toLowerCase());
		
		/*
		if(cadena!=null)
			System.out.println(cadena.toLowerCase());
		else
			System.out.println("parametro invalido!");
		 */		
	}
	
	public static Optional<String> obtieneMsj(int opcion) {
		Optional<String> resultado = Optional.empty();
		
		switch (opcion) {
		case 1:
			resultado = Optional.of("HOLA!");
			break;
		}
		
		return resultado;
	}
}
