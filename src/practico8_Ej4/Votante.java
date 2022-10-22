package practico8_Ej4;

public class Votante {
	private int dni;

	public Votante(int dni) {
		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}
	
	public boolean equals(Object o) {
		try {
			Votante otro = (Votante) o;
			return this.getDni() == otro.getDni();
		}
		catch (Exception e) {
			return false;
		}
	}
	
	
}
