package practico4_Ej4;

import java.time.LocalDate;

public class Entrenador extends Contingente {
	private String federacion;
	
	public Entrenador(String nombre, String apellido, String nroPasaporte, LocalDate fechaNacimiento, String estado, String federacion) {
		super(nombre, apellido, nroPasaporte, fechaNacimiento, estado);
		this.federacion = federacion;
	}
}
