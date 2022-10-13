package practico7a_Ej5;

import java.util.ArrayList;

public class Pelicula {
	private int anioEstreno, edadMinimaRequerida, duracion;
	private String titulo, sinopsis, director;
	private ArrayList<String> actores;
	private ArrayList<String> generos;
	

	public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, int edadMinimaRequerida, int duracion) {
		this.anioEstreno = anioEstreno;
		this.edadMinimaRequerida = edadMinimaRequerida;
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.director = director;
		this.duracion = duracion;
		this.actores = new ArrayList<>();
		this.generos = new ArrayList<>();
	}
	
	public boolean contieneActor(String actor) {
		return actores.contains(actor);
	}
	
	public boolean contieneGenero(String genero) {
		return generos.contains(genero);
	}
	
	public void addGenero(String genero) {
		generos.add(genero);
	}
	
	public boolean equals (Object o) {
		try {
			Pelicula otraPel = (Pelicula) o;
			if(this.getTitulo().equals(otraPel.getTitulo())) { 
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e){
			return false;
		}
	}
	
	@Override
	public String toString() {
		return this.getTitulo();
	}
	
	public int getDuracion() {
		return this.duracion;
	}
	
	public int getAnioEstreno() {
		return anioEstreno;
	}
	public int getEdadMinimaRequerida() {
		return edadMinimaRequerida;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public String getDirector() {
		return director;
	}
	
	
	
}
