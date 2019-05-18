package prueba;

import base.Estudiante;
import base.MiTecnicaHash;

public class Programa {

	public static void main(String[] args) {
		Estudiante est = null;
		MiTecnicaHash hash = new MiTecnicaHash(10);
		int posi = 0;
		
		est = new Estudiante(4533, "pepita", "lejos");
		posi = hash.insertar(est);
		posi = hash.insertar(est);
		
		System.out.println(posi);
	}
}
