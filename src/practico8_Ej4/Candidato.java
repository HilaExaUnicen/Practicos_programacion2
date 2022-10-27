package practico8_Ej4;

public class Candidato {
	
	private String nombre, partidoPolitico, agrupacion;

	public Candidato(String nombre, String partidoPolitico, String agrupacion) {
		this.nombre = nombre;
		this.partidoPolitico = partidoPolitico;
		this.agrupacion = agrupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPartidoPolitico() {
		return partidoPolitico;
	}

	public String getAgrupacion() {
		return agrupacion;
	}
	
	public boolean equals(Object o) {
		try {
			Candidato otro = (Candidato) o;
			return (this.getNombre().equals(otro.getNombre()) && this.getPartidoPolitico().equals(otro.getPartidoPolitico()));
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public String toString() {
		return this.nombre + "  PartidoPolitico: " + this.partidoPolitico; 
	}
	
	
	
}
