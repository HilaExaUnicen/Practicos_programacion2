package practico8_Ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carpeta extends ElementoSistemaArchivos {

	protected ArrayList <ElementoSistemaArchivos> archivos;
	
	public Carpeta(String nombre, LocalDate fechaCreacion, LocalDate fechaUltimaModificacion) {
		super(nombre, fechaCreacion, fechaUltimaModificacion);
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

	@Override
	public ArrayList<ElementoSistemaArchivos> buscarArchivosPor(Filtro f) {
		ArrayList<ElementoSistemaArchivos> resultado = new ArrayList<>();
		
		for(int i = 0; i < archivos.size(); i++) {
			ElementoSistemaArchivos elemIndex = archivos.get(i);
			ArrayList<ElementoSistemaArchivos> listaHija = elemIndex.buscarArchivosPor(f);
			
			resultado.addAll(listaHija);//Los que cumplieron con la condicion, son agregados a listaHija, y luego agregados al resultado final;
			
		}
		
		return resultado;
		
	}
	
	
}
