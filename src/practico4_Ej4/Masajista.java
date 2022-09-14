package practico4_Ej4;

import java.time.LocalDate;

public class Masajista extends Contingente {
	private String tituloUniversitario;
	private int cantAniosExperiencia;
	
	public Masajista(String nombre, String apellido, String nroPasaporte, LocalDate fechaNacimiento, String estado, String tituloUniversitario, int cantAniosExperiencia) {
		super(nombre, apellido, nroPasaporte, fechaNacimiento, estado);
		this.tituloUniversitario = tituloUniversitario;
		this.cantAniosExperiencia = cantAniosExperiencia;
	}
	
	
	
	
}
