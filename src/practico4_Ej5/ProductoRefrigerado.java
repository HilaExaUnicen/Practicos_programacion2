package practico4_Ej5;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
	private int codOrganismoSupervision;
	private double temperaturaMantenimiento;
	
	public ProductoRefrigerado(LocalDate fechaVencimiento, int nroLote, int codOrganismoSupervision, LocalDate fechaEnvasado, double temperaturaMantenimiento, String granjaOrigen) {
		super(fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen);
		this.codOrganismoSupervision = codOrganismoSupervision;
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

}
