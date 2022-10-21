package practico8_Ej3;

import java.util.ArrayList;

public abstract class Elemento {
	
	public abstract ArrayList<Carta> getCartasPor(Filtro f);
	
	public abstract int getCantCartasPor(Filtro f);
	public abstract int getCantTotalCartasRecibidas();
	
	public double getPorcentajeCantCartasPor(Filtro f) {  //Metodo template	
		double porcentaje = 0;
		int resultado = this.getCantCartasPor(f);
		int totalCartasRecibidas = this.getCantTotalCartasRecibidas();
		
		porcentaje = ((resultado/totalCartasRecibidas) * 100);
		
		return porcentaje;
		
	}
	
	
}
