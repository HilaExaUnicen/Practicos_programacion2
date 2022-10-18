package practico7b_Ej1;

import java.time.LocalDate;

public class Archivo extends ElementoSistemaArchivos {
	
	private LocalDate fechaUltimaModificacion;
	private int tamanio;
	
	public Archivo(String nombre, LocalDate fechaCreacion, LocalDate fechaUltimaModificacion, int tamanio) {
		super(nombre, fechaCreacion);
		this.fechaUltimaModificacion = fechaUltimaModificacion;
		this.tamanio = tamanio;
	}

	public LocalDate getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}

	public int getTamanio() {
		return tamanio;
	}

	public int getCantElementos() {//Retorna 0 porque solo las carpetas cuentan su cantidad de elementos
		return 0;
	}
	
	
	
	
}
