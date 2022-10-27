package practico8_Ej3;

import java.util.ArrayList;

public class Zona extends Elemento {
	private ArrayList<Elemento> elementosTerritoriales;
	
	public Zona() {
		this.elementosTerritoriales = new ArrayList<>();
	}
	
	public void addElemento(Elemento e) { //El elemento puede ser una provincia o una mesa de votacion
		this.elementosTerritoriales.add(e);
	}
	
	@Override
	public ArrayList<Carta> getCartasPor(Filtro f) {
		ArrayList<Carta> resultado = new ArrayList<>();
		for(int i = 0; i < elementosTerritoriales.size();i++) {
			ArrayList<Carta> resultadoHijas = elementosTerritoriales.get(i).getCartasPor(f);
			resultado.addAll(resultadoHijas);
		}
		
		return resultado;
	}

	@Override
	public int getCantCartasPor(Filtro f) {
		int resultadoSumaCartas = 0;
		for(int i = 0; i < elementosTerritoriales.size();i++) {
			int sumaHijas = elementosTerritoriales.get(i).getCantCartasPor(f);
			resultadoSumaCartas += sumaHijas;
		}
		
		return resultadoSumaCartas;
	}

	@Override
	public int getCantTotalCartasRecibidas() {
		int resultadoSumaCartas = 0;
		for(int i = 0; i < elementosTerritoriales.size();i++) {
			int sumaHijas = elementosTerritoriales.get(i).getCantTotalCartasRecibidas();
			resultadoSumaCartas += sumaHijas;
		}
		
		return resultadoSumaCartas;
	}
}
