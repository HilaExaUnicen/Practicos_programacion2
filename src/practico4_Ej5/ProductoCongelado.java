package practico4_Ej5;

import java.time.LocalDate;

public class ProductoCongelado extends Producto {
	
	private int codOrganismoSupervision;
	private double temperaturaMantenimiento;

		
	public ProductoCongelado(LocalDate fechaVencimiento, int nroLote, int codOrganismoSupervision, LocalDate fechaEnvasado, double temperaturaMantenimiento, String granjaOrigen) {
		super(fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen);
		this.codOrganismoSupervision = codOrganismoSupervision;
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}


	@Override
	public String toString() {
		return "ProductoCongelado [codOrganismoSupervision=" + codOrganismoSupervision + ", temperaturaMantenimiento="
				+ temperaturaMantenimiento + "]";
	}


	public int getCodOrganismoSupervision() {
		return codOrganismoSupervision;
	}


	public double getTemperaturaMantenimiento() {
		return temperaturaMantenimiento;
	}
	
	
}
