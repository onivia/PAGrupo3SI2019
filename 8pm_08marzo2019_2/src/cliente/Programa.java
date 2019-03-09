package cliente;

import operaciones.aritmeticas.OperacionAritmetica;

public class Programa {

	public static void main(String[] args) {
		int num1 = 20, num2 = 50;
		int r = 0;
		r = OperacionAritmetica.suma(num1,num2);
		System.out.println(r);
	}
}
