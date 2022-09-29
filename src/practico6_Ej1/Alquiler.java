package practico6_Ej1;

import java.time.LocalDate;

public class Alquiler {
	private Cliente cliente;
	private Item item;
	private LocalDate fechaAlquiler;
	private int cantDiasEnAlquiler;
	private boolean loDevolvio;
	
	public Alquiler(Cliente cliente, Item item, LocalDate fechaAlquiler, int cantDiasEnAlquiler) {
		this.cliente = cliente;
		this.item = item;
		this.fechaAlquiler = fechaAlquiler;
		this.cantDiasEnAlquiler = cantDiasEnAlquiler;
		this.loDevolvio = false;
	}

	public Item getItem() {
		return this.item;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void clienteDevolvioItem() {
		this.loDevolvio = true;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean isDevuelto() {
		return loDevolvio;
	}

	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public int getCantDiasEnAlquiler() {
		return cantDiasEnAlquiler;
	}

	public void setCantDiasEnAlquiler(int cantDiasEnAlquiler) {
		this.cantDiasEnAlquiler = cantDiasEnAlquiler;
	}
	
	
}
