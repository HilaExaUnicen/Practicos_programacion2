package practico8_Ej3;

import java.util.ArrayList;

public class Pais extends Elemento {
	protected ArrayList<Elemento> elementosTerritoriales; //Cada elemento (pais, provincia, etc) tendra su propio arreglo de elementos heredado
	
	public Pais() {
		this.elementosTerritoriales = new ArrayList<>();
	}
	
	public void addProvincia(Provincia p) {
		elementosTerritoriales.add(p);
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
