package practico5_Ej5;

public class EmpleadoVendedor extends Empleado {
	private double porcentaje;

	public EmpleadoVendedor(String nombre, String apellido, int dni, double sueldo, double porcentaje) {
		super(nombre, apellido, dni, sueldo);
		this.porcentaje = porcentaje;
	}
	
	@Override
	public double getSueldo(){
		double sumatoriaTotalVentas = 0;
		double extraAPagar = 0;
		
		for(int i = 0; i < ventas.size(); i++) {
			sumatoriaTotalVentas += ventas.get(i).getPrecio();
		}
		
		extraAPagar = (sumatoriaTotalVentas*this.porcentaje);
		
		return (super.getSueldo()+extraAPagar);
	}
	
	
}
