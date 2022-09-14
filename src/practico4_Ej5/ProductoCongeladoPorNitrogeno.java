package practico4_Ej5;

import java.time.LocalDate;

public class ProductoCongeladoPorNitrogeno extends ProductoCongelado {
	private String metodoDeCongelacion;
	private double cantSegundosdeExposicion;
	
	
	public ProductoCongeladoPorNitrogeno(LocalDate fechaVencimiento, int nroLote, int codOrganismoSupervision,
			LocalDate fechaEnvasado, double temperaturaMantenimiento, String granjaOrigen, String metodoDeCongelacion,
			double cantSegundosdeExposicion) {
		super(fechaVencimiento, nroLote, codOrganismoSupervision, fechaEnvasado, temperaturaMantenimiento,
				granjaOrigen);
		this.metodoDeCongelacion = metodoDeCongelacion;
		this.cantSegundosdeExposicion = cantSegundosdeExposicion;
	}


	@Override
	public String toString() {
		return "ProductoCongeladoPorNitrogeno [metodoDeCongelacion=" + metodoDeCongelacion
				+ ", cantSegundosdeExposicion=" + cantSegundosdeExposicion + " Organismo supervisor " + this.getCodOrganismoSupervision() + " " + this.getGranjaOrigen();
	}


	

	
	
	
	
}
