package practico4_Ej5;

import java.time.LocalDate;

public class Producto {
	private LocalDate fechaVencimiento;
	private int nroLote;
	private LocalDate fechaEnvasado;
	private String granjaOrigen;
	
	public Producto(LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen) {
		this.fechaVencimiento = fechaVencimiento;
		this.nroLote = nroLote;
		this.fechaEnvasado = fechaEnvasado;
		this.granjaOrigen = granjaOrigen;
	}

	@Override
	public String toString() {
		return "Producto [fechaVencimiento=" + fechaVencimiento + ", nroLote=" + nroLote + ", fechaEnvasado="
				+ fechaEnvasado + ", granjaOrigen=" + granjaOrigen + "]";
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public int getNroLote() {
		return nroLote;
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public String getGranjaOrigen() {
		return granjaOrigen;
	}
	
	
}
