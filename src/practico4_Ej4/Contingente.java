package practico4_Ej4;

import java.time.LocalDate;

public class Contingente {
	private String nombre, apellido, nroPasaporte;
	private LocalDate fechaNacimiento;
	private String estado;//----------------->Estado representa si esta ocupado, en concentracion, etc.
	
	
	public Contingente(String nombre, String apellido, String nroPasaporte, LocalDate fechaNacimiento, String estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroPasaporte = nroPasaporte;
		this.fechaNacimiento = fechaNacimiento;
		this.estado = estado;
	}


	public String getNombre() {
		return nombre;
	}
	
	public boolean estaDisponible() {
		if(this.estado.equalsIgnoreCase("En pais de origen")) {
			return true;
		}
		else if(this.estado.equalsIgnoreCase("Viajando") || this.estado.equalsIgnoreCase("En concentracion")) {
			return false;
		}else {
			return false;
		}
	}


	public String getApellido() {
		return apellido;
	}


	public String getEstado() {
		return estado;
	}
	
	
}
