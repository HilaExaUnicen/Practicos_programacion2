package practico8_Ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArchivoComprimido extends Carpeta { //El archivo comprimido es similar a la carpeta con la unica diferencia que su tamanio es comprimido

	private int tasaCompresion;
	
	public ArchivoComprimido(String nombre, LocalDate fechaCreacion, int tasaCompresion, LocalDate fechaUltimaModificacion) {
		super(nombre, fechaCreacion, fechaUltimaModificacion);
		this.tasaCompresion = tasaCompresion;
	}
	
	@Override
	public int getTamanio() {
		return (super.getTamanio() / this.getTasaCompresion());
	}

	private int getTasaCompresion() {
		return this.tasaCompresion;
	}
	
	
	//Como archivo comprimido hereda de carpeta, sobreescribimos el metodo buscarArchivos ya que el archivocomprimido tiene otro criterio,
	//si uno de sus elementos cumple con la condicion del filtro, se agrega al resultado.
	
	@Override
	public ArrayList<ElementoSistemaArchivos> buscarArchivosPor(Filtro f){
		ArrayList<ElementoSistemaArchivos> resultado = new ArrayList<>();
		
		for(int i = 0; i < archivos.size(); i++) {
			if(f.cumpleCondicion(archivos.get(i))) {
				resultado.add(this); //Si encontro se agrega a si mismo y retorna el resultado.
				return resultado;
			}
		}
		
		return new ArrayList<ElementoSistemaArchivos>(); //Si no encontro nada devuelve una lista vacia.
	}
	
	
	
}
