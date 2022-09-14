package practico4_Ej5;

import java.time.LocalDate;

public class ProductoCongeladoPorAire extends ProductoCongelado {
	private double porcentajeNitrogeno, porcentajeVaporDeAgua, porcentajeDioxidoDeCarbono, porcentajeOxigeno;

	public ProductoCongeladoPorAire(LocalDate fechaVencimiento, int nroLote, int codOrganismoSupervision, LocalDate fechaEnvasado,
									double temperaturaMantenimiento, String granjaOrigen,double porcentajeNitrogeno,
									double porcentajeVaporDeAgua, double porcentajeDioxidoDeCarbono, double porcentajeOxigeno) {
		super(fechaVencimiento, nroLote, codOrganismoSupervision, fechaEnvasado, temperaturaMantenimiento, granjaOrigen);
		this.porcentajeNitrogeno = porcentajeNitrogeno;
		this.porcentajeVaporDeAgua = porcentajeVaporDeAgua;
		this.porcentajeDioxidoDeCarbono = porcentajeDioxidoDeCarbono;
		this.porcentajeOxigeno = porcentajeOxigeno;
	}


	
	
}
