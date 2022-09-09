package practico2_Ej1;

import java.util.ArrayList;

public class Temporada {
	
	private String tituloSerie;
	private int nroTemporada;
	private ArrayList<Episodio> temporadaConEpisodios = new ArrayList();
	
	
	public Temporada(Serie serie, int nroTemporada) {
		this.tituloSerie = serie.getTitulo();
		this.nroTemporada = nroTemporada;
	}
	
	public void insertEpisodio(Episodio ep, int nroTemporada) {
		if(this.nroTemporada == nroTemporada) {
			temporadaConEpisodios.add(ep);
		}
	}
	
	public int getEpisodiosVistos() {
		int cantEpisodios = 0;
			for(int i = 0; i < temporadaConEpisodios.size(); i++) {
				if(temporadaConEpisodios.get(i).isVisto() == true) {
					cantEpisodios++;
			}
		}
		return cantEpisodios;
	}
	
	public float getPromedioCalificacionTemporada(){
		float promedio = 0;
		float suma = 0;
		for (int i = 0; i < temporadaConEpisodios.size(); i++){
			if(temporadaConEpisodios.get(i).isVisto() == true) {
				suma = suma + temporadaConEpisodios.get(i).getCalificacion();
			}
		}
		
		promedio = suma/this.getEpisodiosVistos();
		return promedio;
	}
	
	public boolean todosLosEpisodiosDeTemporadaVistos() {
		int cantEpisodiosVistos = getEpisodiosVistos();
		if (cantEpisodiosVistos == this.temporadaConEpisodios.size()) {
			return true;
		}
		else {
			return false;
		}
	}
	

	public int getNroTemporada() {
		return nroTemporada;
	}
	
}
