package practico2_Ej1;

public class Episodio {
	private String tituloEpisodio;
	private String descripcion;
	private boolean visto;
	private int calificacion;
	private int perteneceATemporada;

	public Episodio(String titulo, String descripcion, boolean visto, int calificacion, int perteneceATemporada) {
		this.tituloEpisodio = titulo;
		this.descripcion = descripcion;
		this.visto = visto;
		if(visto != false) {
			this.calificacion = calificacion;
		}
		else {
			this.calificacion = -1;
		}
		this.perteneceATemporada = perteneceATemporada;
	}
	
	

	public void setCalificacion(int calificacion) {
		if(visto == true && calificacion >= 1 && calificacion <=5) {
			this.calificacion = calificacion;
		}
	}
	
	public int getPerteneceATemporada() {
		return perteneceATemporada;
	}


	public String getTituloEpisodio() {
		return tituloEpisodio;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public boolean isVisto() {
		return visto;
	}


	public int getCalificacion() {
		return calificacion;
	}
}