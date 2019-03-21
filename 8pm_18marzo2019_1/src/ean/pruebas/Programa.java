package ean.pruebas;

import ean.facturas.FacturaVentaNacional;
import ean.facturas.IFacturaVentaNacional;
import ean.terceros.*;

public class Programa {
	public static void main(String[] args) {
		//int opcion = 3;
		Tercero tercero = null;		
		for (int i = 1; i <=3; i++) {		
			tercero = Tercero.crearTercero(i);
			liquidarTercero(tercero);
		}
		IFacturaVentaNacional facturador = null;
		facturador = new Proveedor();
		obtenerFactura(facturador);
		facturador = new FacturaVentaNacional();
		obtenerFactura(facturador);
	}
	
	public static void liquidarTercero(Tercero tercero) {
		tercero.liquidar();
		//regla de negocio #1
		//regla de negocio #2
	}
	
	public static void obtenerFactura(IFacturaVentaNacional facturador) {
		facturador.obtenerFactura();
	}
}
