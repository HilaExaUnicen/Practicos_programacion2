package practico4_Ej6;

public class PersonasAsociadas {
	private String nombre, apellido;
	private int edad;
	
	public PersonasAsociadas(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}
}
