package ean.terceros;

public class Empleado extends Tercero {

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void liquidar() {
		System.out.println("paso por liquidar de Empleado");
	}
}
