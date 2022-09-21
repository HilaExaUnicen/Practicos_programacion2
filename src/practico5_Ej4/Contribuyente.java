package practico5_Ej4;

public class Contribuyente {
	private String nombre;
	private String cuit;
	private double montoAPagar;
	
	public Contribuyente(String nombre, String cuit, double montoAPagar) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.montoAPagar = montoAPagar;
	}

	public double getMontoAPagar() {
		return montoAPagar;
	}

	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}
	
	
}
