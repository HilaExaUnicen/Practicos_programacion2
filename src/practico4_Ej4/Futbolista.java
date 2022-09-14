package practico4_Ej4;

import java.time.LocalDate;

public class Futbolista extends Contingente {
	private String posicion, piernaBuena;
	private int cantGoles;
	
	public Futbolista(String nombre, String apellido, String nroPasaporte, LocalDate fechaNacimiento, String estado, String posicion, String piernaBuena, int cantGoles) {
		super(nombre, apellido, nroPasaporte, fechaNacimiento, estado);
		this.posicion = posicion;
		this.cantGoles = cantGoles;
		this.piernaBuena = piernaBuena;
	}
	
	
	
	
}
