package ean.terceros;

import ean.facturas.FacturaVentaNacional;
import ean.facturas.IFacturaVentaNacional;

public class Proveedor extends Tercero implements IFacturaVentaNacional {
	public Proveedor() {
		// TODO Auto-generated constructor stub
	}

	public void obtenerOrdenesCompra() {
		System.out.println("paso por obtenerOrdenesCompra de Proveedor");
	}

	@Override
	public void liquidar() {
		System.out.println("paso por liquidar de Proveedor");		
	}

	@Override
	public void obtenerFactura() {
		FacturaVentaNacional fvn = new FacturaVentaNacional();
		fvn.obtenerFactura();		
	}
}
