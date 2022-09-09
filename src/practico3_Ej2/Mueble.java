package practico3_Ej2;

public class Mueble {
	static final double PORCENTAJEVALORVENTA = 0.35;
	private double peso, costoFabricacion, valorDeVenta;
	private String tipoMadera;
	private String color;
	private String nombre;
	private boolean enStock;
	
	public Mueble(String nombre, double peso, double costoFabricacion, String tipoMadera, String color, boolean enStock) {
		this.peso = peso;
		this.costoFabricacion = costoFabricacion;
		this.tipoMadera = tipoMadera;
		this.color = color;
		this.nombre = nombre;
		this.valorDeVenta = (costoFabricacion + (PORCENTAJEVALORVENTA * costoFabricacion));
		this.enStock = enStock;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public double getCostoFabricacion() {
		return costoFabricacion;
	}

	public double getValorDeVenta() {
		return valorDeVenta;
	}

	public String getTipoMadera() {
		return tipoMadera;
	}

	public boolean isEnStock() {
		return enStock;
	}
	
	


	

}
