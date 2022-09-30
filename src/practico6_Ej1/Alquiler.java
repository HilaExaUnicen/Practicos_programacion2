package practico6_Ej1;

import java.time.LocalDate;

public class Alquiler {
	private Cliente cliente;
	private Item item;
	private LocalDate fechaADevolver;
	private boolean loDevolvio;
	
	public Alquiler(Cliente cliente, Item item, LocalDate fechaADevolver) {
		this.cliente = cliente;
		this.item = item;
		this.fechaADevolver = fechaADevolver;
		this.loDevolvio = false;
	}

	
	
	public boolean alquilerEstaVencido() {
		LocalDate hoy = LocalDate.now();
		
		if(this.fechaADevolver.isBefore(hoy) && !loDevolvio ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void clienteDevuelveItem() {
		this.loDevolvio = true;
		this.item.itemDevuelto();
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public LocalDate getFechaADevolver() {
		return fechaADevolver;
	}	
}
