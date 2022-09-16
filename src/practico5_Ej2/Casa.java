package practico5_Ej2;

import java.util.ArrayList;

public class Casa {
	private String nombre;
	private int cantMaxAlumnos;
	private ArrayList<String> cualidadesRequeridas;
	protected ArrayList<Alumno> alumnos;
	
	
	public Casa(String nombre, int cantMaxAlumnos) {
		this.nombre = nombre;
		this.cantMaxAlumnos = cantMaxAlumnos;
		cualidadesRequeridas = new ArrayList();
		alumnos = new ArrayList();
	}
	
	public boolean checkAlumnoEsApto(Alumno a) {
		for(int i = 0; i < cualidadesRequeridas.size(); i++) {
			if(!a.contieneCualidad(cualidadesRequeridas.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	public void addAlumno(Alumno a) {
		if((alumnos.size() <= cantMaxAlumnos) && (this.checkAlumnoEsApto(a))) {
			alumnos.add(a);
			a.setCasa(this.getNombre());
		}
		else {
			System.out.println("Se ha alcanzado la capacidad maxima de alumnos para esta casa");
		}
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void addCualidadRequerida(String c) {
		cualidadesRequeridas.add(c);
	}
}
