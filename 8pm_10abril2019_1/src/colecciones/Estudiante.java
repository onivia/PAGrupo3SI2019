package colecciones;

public class Estudiante {
	public int codigo;
	public String nombre;
	public String direccion;
	public String telefono;
	
	public Estudiante(int codigo, String nombre, String direccion) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public Estudiante(int codigo, String nombre, String direccion, String telefono) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	

	@Override
	public int hashCode() {
		int resultado = 0;
		int primo = 31;
		
		resultado = primo + String.valueOf(this.codigo).hashCode();
		resultado = (primo * resultado) + this.nombre.hashCode();
		resultado = (primo * resultado) + this.direccion.hashCode();
		
		return Math.abs(resultado);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		
		if(obj!=null && obj.hashCode()==this.hashCode())
			sonIguales = true;
		
		return sonIguales;
	}
	@Override
	public String toString() {
		String resultado = "";
		resultado = "codigo: " + this.codigo + " nombre: " + this.nombre + " direccion: " + this.direccion + " telefono: " + this.telefono;
		
		return resultado;
	}
}
