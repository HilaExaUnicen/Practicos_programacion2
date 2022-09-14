package practico4_Ej5;

import java.time.LocalDate;

public class ProductoCongeladoPorAgua extends ProductoCongelado {
	
	private double grSalPorLitroDeAgua;

	public ProductoCongeladoPorAgua(LocalDate fechaVencimiento, int nroLote, int codOrganismoSupervision,
			LocalDate fechaEnvasado, double temperaturaMantenimiento, String granjaOrigen,  double grSalPorLitroDeAgua) {
		super(fechaVencimiento, nroLote, codOrganismoSupervision, fechaEnvasado, temperaturaMantenimiento, granjaOrigen);
		this.grSalPorLitroDeAgua = grSalPorLitroDeAgua;
	}


	
	

}
