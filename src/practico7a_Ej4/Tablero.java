package practico7a_Ej4;

import java.util.ArrayList;

public class Tablero {
	private int puntajeMinimo;
	private ArrayList<Ficha> fichas;
	private double dificultad;
	
	
	public Tablero(int puntajeMinimo) {
		this.puntajeMinimo = puntajeMinimo;
		this.fichas = new ArrayList<>();
		this.dificultad = 0;
	}
	
	public void addFicha(Ficha f) {
		fichas.add(f);
		this.setDificultad();
	}
	
	public double getDificultad() {
		return dificultad;
	}

	public void setDificultad() {
		this.dificultad = (this.getSumatoriaFortalezaFichas()/this.getSumatoriaFortalezaFichas());
	}

	public int getPuntajeMinimo() {
		return puntajeMinimo;
	}



	public int getSumatoriaFortalezaFichas() {
		int sumador = 0;
		for(int i = 0; i < fichas.size(); i++) {
			sumador += fichas.get(i).getFortaleza();
		}
		
		return sumador;
	}
	
	public int getSumatoriaEspacioOcupadoFichas() {
		int sumador = 0;
		for(int i = 0; i < fichas.size(); i++) {
			sumador += fichas.get(i).getEspacioQueOcupa();
		}
		
		return sumador;
	}
	
	
}
