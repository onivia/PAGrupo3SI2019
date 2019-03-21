package ean.terceros;

public class Cliente extends Tercero {

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public void obtenerIva() {
		System.out.println("paso por obtenerIva de Cliente");
	}

	@Override
	public void liquidar() {
		System.out.println("paso por liquidar de Cliente");		
	}

}
