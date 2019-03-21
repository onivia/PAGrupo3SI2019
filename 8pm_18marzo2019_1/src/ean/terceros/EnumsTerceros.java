package ean.terceros;

public class EnumsTerceros {
	
	public enum TipoTercero {
		CLIENTE(1),
		PROVEEDOR(2),
		EMPLEADO(3);
		
		private int numtercero = 1;
		
		private TipoTercero(int numerito) {
			this.numtercero = numerito;			
		}
		
		public int getNumTercero() {
			return (this.numtercero);
		}

		@Override
		public String toString() {			
			return (super.toString().toLowerCase());
		}
		
		
	}
}
