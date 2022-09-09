package practico2_Ej5;

import java.time.LocalDate;
import java.time.LocalTime;


public class Turno {
	private LocalDate dia;
	private LocalTime hora;
	private Cliente cliente;
	private Peluquero peluquero;
	private Peluqueria peluqueria;
	private double precio;

	public Turno(LocalDate dia, LocalTime hora, Cliente cliente, Peluquero peluquero, Peluqueria peluqueria, double precio) {
		this.dia = dia;
		this.hora = hora;
		this.cliente = cliente;
		this.peluquero = peluquero;
		if(peluqueria.getClienteFrecuente(cliente)) {
			double descuento10 = (0.10 * precio);	//CONSTANTES EN CODIGO NO ES BUENA PRACTICA 
			this.precio = (precio - descuento10);
		}
		else {
			this.precio = precio;
		}
	}

	public LocalDate getDia() {
		return dia;
	}

	public LocalTime getHora() {
		return hora;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Peluquero getPeluquero() {
		return peluquero;
	}

	public double getPrecio() {
		return precio;
	}
	
	


}
