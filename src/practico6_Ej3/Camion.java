package practico6_Ej3;

import java.time.LocalDate;

public class Camion implements ElementoOrdenable {
	private String patente;
	private LocalDate fechaQueFueCargado;
	
	public Camion(String patente, LocalDate fechaQueFueCargado) {
		this.patente = patente;
		this.fechaQueFueCargado = fechaQueFueCargado;
	}

	@Override
	public boolean esMayor(ElementoOrdenable e1) {
		Camion otro = (Camion) e1; //Casteamos el ElementoOrdenable
		
		if(this.fechaQueFueCargado.isAfter(otro.getFechaQueFueCargado())) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "patente=" + patente + ", fechaQueFueCargado=" + fechaQueFueCargado;
	}

	public LocalDate getFechaQueFueCargado() {
		return fechaQueFueCargado;
	}
	
	
	
	
	

}


