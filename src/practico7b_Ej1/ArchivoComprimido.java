package practico7b_Ej1;

import java.time.LocalDate;

public class ArchivoComprimido extends Carpeta { //El archivo comprimido es similar a la carpeta con la unica diferencia que su tamanio es comprimido

	private int tasaCompresion;
	
	public ArchivoComprimido(String nombre, LocalDate fechaCreacion, int tasaCompresion) {
		super(nombre, fechaCreacion);
		this.tasaCompresion = tasaCompresion;
	}
	
	@Override
	public int getTamanio() {
		return (super.getTamanio() / this.getTasaCompresion());
	}

	private int getTasaCompresion() {
		return this.tasaCompresion;
	}
	
	
	
}
