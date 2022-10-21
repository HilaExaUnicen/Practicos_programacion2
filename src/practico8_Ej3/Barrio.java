package practico8_Ej3;


public class Barrio extends Ciudad{
	
	
	public Barrio() {
		super();
	}
	
	public void addBuzon(Buzon b) {
		if(!elementosTerritoriales.contains(b)) {
			elementosTerritoriales.add(b);
		}
	}

}

//	@Override
//	public ArrayList<Carta> getCartasPor(Filtro f) {
//		ArrayList<Carta> resultado = new ArrayList<>();
//		for(int i = 0; i < buzones.size();i++) {
//			ArrayList<Carta> resultadoHijas = buzones.get(i).getCartasPor(f);
//			resultado.addAll(resultadoHijas);
//		}
//		
//		return resultado;
//	}
//	
//	public int getCantCartasPor(Filtro f) {
//		int resultadoSumaCartas = 0;
//		for(int i = 0; i < buzones.size();i++) {
//			int sumaHijas = buzones.get(i).getCantCartasPor(f);
//			resultadoSumaCartas += sumaHijas;
//		}
//		
//		return resultadoSumaCartas;
//	}
//	
//	@Override
//	public int getCantTotalCartasRecibidas() {
//		int resultadoSumaCartas = 0;
//		for(int i = 0; i < buzones.size();i++) {
//			int sumaHijas = buzones.get(i).getCantTotalCartasRecibidas();
//			resultadoSumaCartas += sumaHijas;
//		}
//		
//		return resultadoSumaCartas;
//	}
//}

