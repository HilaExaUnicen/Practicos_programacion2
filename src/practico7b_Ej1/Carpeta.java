package practico7b_Ej1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carpeta extends ElementoSistemaArchivos {

	private ArrayList <ElementoSistemaArchivos> archivos;
	
	public Carpeta(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
		this.archivos = new ArrayList<>();
	}

	public void addElemento(ElementoSistemaArchivos elemento) {
		archivos.add(elemento);
	}
	
	
	public int getTamanio() {
		int sumadorTamanio = 0;
		
		for(int i = 0; i < archivos.size(); i++) {
			sumadorTamanio += archivos.get(i).getTamanio();
		}
		
		return sumadorTamanio;
	}
	
	public int getCantElementos() {
		int sumadorCantElementos = this.archivos.size();
		
		for(int i = 0; i < archivos.size(); i++) {
			sumadorCantElementos += archivos.get(i).getCantElementos();
		}
		
		return sumadorCantElementos;
	}
	
	
}
