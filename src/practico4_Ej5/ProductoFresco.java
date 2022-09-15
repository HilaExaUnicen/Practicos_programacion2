package practico4_Ej5;

import java.time.LocalDate;

public class ProductoFresco extends Producto {
	
	public ProductoFresco(LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen) {
		super(fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen);
	}
}
