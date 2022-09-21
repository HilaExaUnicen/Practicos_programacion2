package practico5_Ej4;

public class ContribuyenteComerciante extends Contribuyente {
	public static final double PORCENTAJEIMPUESTOFACTURADOVENTAS = 0.035; //3.5%
	public static final double CUOTAMONTOFIJO = 0.5;
	private double totalFacturadoVentas;

	public ContribuyenteComerciante(String nombre, String cuit, double montoAPagar, double totalFacturadoVentas ) {
		super(nombre, cuit, ((montoAPagar*CUOTAMONTOFIJO)+(totalFacturadoVentas*PORCENTAJEIMPUESTOFACTURADOVENTAS))); 
		
		//El comerciante solo paga el 50% del monto fijo y el 3.5% sobre las ventas
	
	}
	
}


