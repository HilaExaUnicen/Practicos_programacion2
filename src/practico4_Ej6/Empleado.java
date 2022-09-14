package practico4_Ej6;

public class Empleado extends PersonasAsociadas {
	private int nroLegajo, sueldo;

	public Empleado(String nombre, String apellido, int edad, int nroLegajo, int sueldo) {
		super(nombre, apellido, edad);
		this.nroLegajo = nroLegajo;
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return  "Empleado: " + this.getApellido() + " " + this.getNombre() + " Edad:" + this.getEdad() + " nroLegajo: " + this.nroLegajo;
	}
}
