package practico6_Ej1;

public class Cliente {
	private String nombre;
	private int dni;
	
	public Cliente(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String toString() {
		return this.nombre + "  " + this.dni;
	}
	
}
