package practico7b_Ej1;

import java.time.LocalDate;

public class Link extends ElementoSistemaArchivos {

	private static final int tamanioAccesoDirecto = 1;
	private int tamanio;
	private ElementoSistemaArchivos ref;
	
	public Link(String nombre, LocalDate fechaCreacion, ElementoSistemaArchivos ref) {
		super(nombre, fechaCreacion);
		this.tamanio = tamanioAccesoDirecto;
		this.ref = ref;
	}

	public int getTamanio() {
		return tamanio;
	}

	public ElementoSistemaArchivos getRef() {
		return ref;
	}

	public int getCantElementos() { //Retorna 0 porque solo las carpetas cuentan su cantidad de elementos
		return 0;
	}
	
	
	
	
	
	
	
}
