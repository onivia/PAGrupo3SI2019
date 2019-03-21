package ean.terceros;

public abstract class Tercero {
	public abstract void liquidar();
	
	public void validarSarglaft() {
		System.out.println("paso por validarSarglaft de Tercero");		
	}
	
	public static Tercero crearTercero(EnumsTerceros.TipoTercero tipotercero) {
		switch (tipotercero) {
		case CLIENTE: //Cliente
			return (new Cliente());
		case PROVEEDOR: //Proveedor
			return (new Proveedor());
		case EMPLEADO:
			return (new Empleado());
		default:
			return null;
		}		
	}
}
