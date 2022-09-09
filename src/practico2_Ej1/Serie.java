package practico2_Ej1;

import java.util.ArrayList;

public class Serie {
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private int nroTemporadas;
	private ArrayList<Temporada> SerieConTemporadas = new ArrayList();
	
	
	public Serie(String titulo, String descripcion, String creador, String genero, int nroTemporadas) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.nroTemporadas = nroTemporadas;
	}
	
	public void insertTemporada(Temporada season) {
		SerieConTemporadas.add(season);
	}
	
	public int getCantidadEpisodiosVistosTotalSerie() {
		int cantEpisodiosVistos = 0;
		
		for(int i = 0; i < SerieConTemporadas.size(); i++) {
			cantEpisodiosVistos = cantEpisodiosVistos + SerieConTemporadas.get(i).getEpisodiosVistos();
		}
		
		return cantEpisodiosVistos;
	}

	public float getPromedioCalificacionSerie() {
		float promedio = 0;
		float suma = 0;
		float cantEpisodiosTotal = 0;
		
		for (int i = 0; i < SerieConTemporadas.size(); i++) {
			suma = suma + SerieConTemporadas.get(i).getPromedioCalificacionTemporada();
			cantEpisodiosTotal = cantEpisodiosTotal + SerieConTemporadas.get(i).getEpisodiosVistos(); //REVISAR
		}
		
		promedio = (suma/cantEpisodiosTotal);
		return promedio;
	}
	
	
	public boolean areTodosVistos() {
		int contador = 0;
		for(int i = 0; i < SerieConTemporadas.size(); i++) {
			if(SerieConTemporadas.get(i).todosLosEpisodiosDeTemporadaVistos() == true) {
				contador++;
			}
		}
		
		if(contador == SerieConTemporadas.size()) {
			return true;
		}
		else {
			return false;
		}
	}

	public String getTitulo() {
		return titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public String getCreador() {
		return creador;
	}


	public String getGenero() {
		return genero;
	}


	public int getNroTemporadas() {
		return nroTemporadas;
	}
	
}