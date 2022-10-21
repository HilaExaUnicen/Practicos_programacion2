package practico8_Ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Link extends ElementoSistemaArchivos {

	private static final int tamanioAccesoDirecto = 1;
	private int tamanio;
	private ElementoSistemaArchivos ref;
	
	public Link(String nombre, LocalDate fechaCreacion, ElementoSistemaArchivos ref, LocalDate fechaUltimaModificacion) {
		super(nombre, fechaCreacion,fechaUltimaModificacion);
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

	public ArrayList<ElementoSistemaArchivos> buscarArchivosPor(Filtro f) {
		ArrayList<ElementoSistemaArchivos> resultado = new ArrayList<>();
		
		if(f.cumpleCondicion(this)) {
			resultado.add(this);
		}
		
		return resultado;
	}
	
	
	
	
	
	
	
}
