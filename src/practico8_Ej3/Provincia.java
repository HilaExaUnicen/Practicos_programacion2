package practico8_Ej3;


public class Provincia extends Pais {
	
	public Provincia() {
		super();
	}
	
	public void addCiudad(Ciudad c) {
		elementosTerritoriales.add(c);
	}

	//METODOS QUE HEREDA DE PAIS
	
//	public ArrayList<Carta> getCartasPor(Filtro f) {
//		ArrayList<Carta> resultado = new ArrayList<>();
//		for(int i = 0; i < ciudades.size();i++) {
//			ArrayList<Carta> resultadoHijas = ciudades.get(i).getCartasPor(f);
//			resultado.addAll(resultadoHijas);
//		}
//		
//		return resultado;
//	}
//	
//	public int getCantCartasPor(Filtro f) {
//		int resultadoSumaCartas = 0;
//		for(int i = 0; i < ciudades.size();i++) {
//			int sumaHijas = ciudades.get(i).getCantCartasPor(f);
//			resultadoSumaCartas += sumaHijas;
//		}
//		
//		return resultadoSumaCartas;
//	}
//	
//	@Override
//	public int getCantTotalCartasRecibidas() {
//		int resultadoSumaCartas = 0;
//		for(int i = 0; i < ciudades.size();i++) {
//			int sumaHijas = ciudades.get(i).getCantTotalCartasRecibidas();
//			resultadoSumaCartas += sumaHijas;
//		}
//		
//		return resultadoSumaCartas;
//	}
}
