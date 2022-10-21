package practico8_Ej3;


public class Ciudad extends Provincia {
	
	public Ciudad() {
		super();
	}
	
	public void addBarrio(Barrio b) {
		elementosTerritoriales.add(b);
	}
	
	//Hereda de provincia los metodos
	
//	public ArrayList<Carta> getCartasPor(Filtro f) {
//		ArrayList<Carta> resultado = new ArrayList<>();
//		for(int i = 0; i < barrios.size();i++) {
//			ArrayList<Carta> resultadoHijas = barrios.get(i).getCartasPor(f);
//			resultado.addAll(resultadoHijas);
//		}
//		
//		return resultado;
//	}
//	
//	public int getCantCartasPor(Filtro f) {
//		int resultadoSumaCartas = 0;
//		for(int i = 0; i < barrios.size();i++) {
//			int sumaHijas = barrios.get(i).getCantCartasPor(f);
//			resultadoSumaCartas += sumaHijas;
//		}
//		
//		return resultadoSumaCartas;
//	}
//	
//	@Override
//	public int getCantTotalCartasRecibidas() {
//		int resultadoSumaCartas = 0;
//		for(int i = 0; i < barrios.size();i++) {
//			int sumaHijas = barrios.get(i).getCantTotalCartasRecibidas();
//			resultadoSumaCartas += sumaHijas;
//		}
//		
//		return resultadoSumaCartas;
//	}
}
