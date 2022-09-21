package practico5_Ej4;

public class ContribuyenteProgramador extends Contribuyente {
	public static final double PORCENTAJEIMPUESTODESARROLLO = 0.02; //2%
	public static final double CUOTAMONTOFIJO = 0.2; //Abona 20% del monto fijo
	private double totalFacturadoDesarrollo;

	public ContribuyenteProgramador(String nombre, String cuit, double montoAPagar, double totalFacturadoDesarrollo ) {
		super(nombre, cuit, ((montoAPagar*CUOTAMONTOFIJO)+(totalFacturadoDesarrollo*PORCENTAJEIMPUESTODESARROLLO))); 
		//El programador solo paga el 20% del monto fijo, y el 2% de lo facturado
	}
	
}
