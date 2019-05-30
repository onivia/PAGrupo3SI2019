package principal;

public class Estudiante {
	public Integer codigo;
	public String nombre;

	public Estudiante(Integer codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return ("codigo: " + codigo + " nombre: " + nombre); 
	}
}
