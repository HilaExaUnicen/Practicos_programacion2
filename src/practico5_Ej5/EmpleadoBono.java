package practico5_Ej5;

public class EmpleadoBono extends Empleado {
	private double bono;
	private int ventasNecesariasParaBono;
	
	
	public EmpleadoBono(String nombre, String apellido, int dni, double sueldo, double bono, int ventasNecesariasParaBono) {
		super(nombre, apellido, dni, sueldo);
		this.bono = bono;
		this.ventasNecesariasParaBono = ventasNecesariasParaBono;
	}
	
	@Override
	public double getSueldo() {
		int cantVentas = this.getCantVentas();
		
		if(cantVentas >= ventasNecesariasParaBono) {
			return (super.getSueldo()+this.bono);
		}
		
		return super.getSueldo();
	}
}
