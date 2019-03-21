package ean.pruebas;

import ean.facturas.FacturaVentaNacional;
import ean.facturas.IFacturaVentaNacional;
import ean.terceros.*;

public class Programa {
	public static void main(String[] args) {
		//int opcion = 3;		
		EnumsTerceros.TipoTercero tipotercero = EnumsTerceros.TipoTercero.PROVEEDOR;
		
		System.out.println(tipotercero.getNumTercero());
		System.out.println(tipotercero.toString());
		
		Tercero tercero = null;
		tercero = Tercero.crearTercero(tipotercero);
		liquidarTercero(tercero);
//		IFacturaVentaNacional facturador = null;
//		facturador = new Proveedor();
//		obtenerFactura(facturador);
//		facturador = new FacturaVentaNacional();
//		obtenerFactura(facturador);
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
