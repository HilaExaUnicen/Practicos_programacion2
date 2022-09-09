package practico3_Ej3;

import java.util.ArrayList;

public class Jugador {
	private String nombre;
	private int cantPuntos;
	private ArrayList<Personaje> mazoPersonajes; //Se le cargan 3 cartas aleatorias al mazo
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		mazoPersonajes = new ArrayList();
		this.cantPuntos = 0;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void incrementarPuntos() {
		this.cantPuntos++;
	}

	public int getCantPuntos() {
		return cantPuntos;
	}
	
	public void addPersonajesAMazo(Personaje p) {
		mazoPersonajes.add(p);
	}

	public ArrayList<Personaje> getMazoPersonajes() {
		return mazoPersonajes;
	}
	
	
	
	
	
}
