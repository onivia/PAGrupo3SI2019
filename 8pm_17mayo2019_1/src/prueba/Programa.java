package prueba;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import base.Estudiante;
import base.MiTecnicaHash;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		int maxEntradas = 1000000;
		MiTecnicaHash hash = null;
		int codigoEstudiante = 0;
		LocalDateTime d1 = null;
		LocalDateTime d2 = null;
		Estudiante est = null;
		
		hash = new MiTecnicaHash(maxEntradas);
		d1 = LocalDateTime.now();
		for (int i = 0; i < maxEntradas; i++) {
			hash.insertar(new Estudiante(i, "pepita" + (i+1), "lejos" + (i+1)));			
		}
		
		d2 = LocalDateTime.now();
		System.out.println(ChronoUnit.MILLIS.between(d1, d2) + "MiliSegs insertando (" + maxEntradas + ") entradas!.");
		
		codigoEstudiante = 10000;
		d1 = LocalDateTime.now();
		est = hash.obtener(codigoEstudiante);
		//Thread.currentThread().sleep(500);
		d2 = LocalDateTime.now();
		if(est!=null)
			System.out.println(est);
		else
			System.out.println("Estudiante (" + codigoEstudiante + ") NO fue encontrado!.");
		System.out.println(ChronoUnit.NANOS.between(d1, d2) + "NanoSegs obteniendo el estudiante (" + codigoEstudiante + ").");
	}
}
