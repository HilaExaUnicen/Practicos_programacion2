package practico4_Ej3;

public class EmpleadoHorasExtra extends Empleado {
	private final static double MONTOXCADAHORAEXTRA = 1000;
	private int cantHorasExtra;
	
	public EmpleadoHorasExtra(String nombre, String apellido, double sueldo, int cantHorasExtra){
		super(nombre, apellido, sueldo+(cantHorasExtra*MONTOXCADAHORAEXTRA));
		this.cantHorasExtra = cantHorasExtra;
	}

	public int getCantHorasExtra() {
		return cantHorasExtra;
	}

	
	
}
