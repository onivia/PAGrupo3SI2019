package prueba;

import operaciones.aritmeticas.OperacionAritmetica;

public class PruebaOperacionAritmetica {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		int r = 0;
		
		if(args.length == 2) {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			r = OperacionAritmetica.suma(num1, num2);
			System.out.println("el resultado de la suma es: " + r);
		} else {
			System.out.println("ERROR, no se han entrado 2 numeros!.");
		}
	}
}
