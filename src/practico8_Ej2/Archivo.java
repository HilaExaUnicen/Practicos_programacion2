package practico8_Ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Archivo extends ElementoSistemaArchivos {
	
	private int tamanio;
	
	public Archivo(String nombre, LocalDate fechaCreacion, LocalDate fechaUltimaModificacion, int tamanio) {
		super(nombre, fechaCreacion, fechaUltimaModificacion);
		this.tamanio = tamanio;
	}

	public int getTamanio() {
		return tamanio;
	}

	public int getCantElementos() {//Retorna 0 porque solo las carpetas cuentan su cantidad de elementos
		return 0;
	}

	@Override
	public ArrayList<ElementoSistemaArchivos> buscarArchivosPor(Filtro f) {
		ArrayList<ElementoSistemaArchivos> resultado = new ArrayList<>();
		
		if(f.cumpleCondicion(this)) {
			resultado.add(this);
		}
		
		return resultado;
	}
	
	
	
	
}
