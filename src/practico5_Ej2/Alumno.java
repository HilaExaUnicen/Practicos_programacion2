package practico5_Ej2;

import java.util.ArrayList;

public class Alumno {
	private String nombre, casa, dni;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> familiares;
	
	public Alumno(String nombre, String casa, String dni) {
		this.nombre = nombre;
		this.casa = casa;
		this.dni = dni;
		cualidades = new ArrayList();
		familiares = new ArrayList();
	}
	
	public void addCualidad(String c) {
		cualidades.add(c);
	}
	
	public void addFamiliar(Alumno a) {
		familiares.add(a);
	}
	
	public boolean contieneCualidad(String c) {
		return cualidades.contains(c);
	}
	
	public boolean contieneFamiliar(Alumno a) {
		return familiares.contains(a);
	}
	
	@Override 
	public boolean equals(Object o) {
		try {
			Alumno otro = (Alumno) (o);
			return this.dni.equals(otro.getDni());
		} 
		catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	private String getDni() {
		return this.dni;
	}

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}
}