package practico8_Ej1;

import java.time.LocalDate;

public class Alquiler {
	private LocalDate fecha;
	private int idCancha, montoAbonado;
	
	public Alquiler(LocalDate fecha, int idCancha, int montoAbonado) {
		this.fecha = fecha;
		this.idCancha = idCancha;
		this.montoAbonado = montoAbonado;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getIdCancha() {
		return idCancha;
	}

	public int getMontoAbonado() {
		return montoAbonado;
	}
	
	
	
	
	
}
