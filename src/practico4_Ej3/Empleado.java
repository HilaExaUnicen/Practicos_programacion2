package practico4_Ej3;

public class Empleado {
	private String nombre, apellido;
	private double sueldo;


	public Empleado(String nombre, String apellido, double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
	}
	
	public Empleado(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public double getSueldo() {
		return sueldo;
	}
}
