package practico7b_Ej1;

import java.time.LocalDate;

public abstract class ElementoSistemaArchivos {
	private String nombre;
	private LocalDate fechaCreacion;
	
	public ElementoSistemaArchivos(String nombre, LocalDate fechaCreacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public abstract int getTamanio();
	
	public abstract int getCantElementos();
	
	
}
