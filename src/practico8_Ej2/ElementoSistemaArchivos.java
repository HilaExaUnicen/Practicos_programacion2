package practico8_Ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoSistemaArchivos {
	private String nombre;
	private LocalDate fechaCreacion;
	private LocalDate fechaUltimaModificacion;
	
	public ElementoSistemaArchivos(String nombre, LocalDate fechaCreacion, LocalDate fechaUltimaModificacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	
	public LocalDate getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}

	public abstract int getTamanio();
	
	public abstract int getCantElementos();
	
	public abstract ArrayList<ElementoSistemaArchivos> buscarArchivosPor(Filtro f);




	
	
}
