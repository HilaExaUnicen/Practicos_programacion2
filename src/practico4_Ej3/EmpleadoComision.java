package practico4_Ej3;

public class EmpleadoComision extends Empleado {
	private final static double COMISIONXVENTA = 250;
	private int cantVentas;
	
	public EmpleadoComision(String nombre, String apellido, double sueldo, int cantVentas){
		super(nombre, apellido, sueldo + (cantVentas*COMISIONXVENTA));
		this.cantVentas = cantVentas;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	
	
}
