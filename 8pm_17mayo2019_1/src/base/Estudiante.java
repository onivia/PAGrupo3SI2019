package base;

public class Estudiante {
	public int codigo;
	private String nombre;
	private String direccion;

	public Estudiante(int codigo, String nombre, String direccion) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public Estudiante(int codigo) {
		this.codigo = codigo;
		this.nombre = "";
		this.direccion = "";
	}

	@Override
	public String toString() {
		return ("codigo:" + codigo + " nombre:" + nombre + " direccion:" + direccion);
	}
}
