package practico8_Ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClubFutbol5 {
	private ArrayList<Socio> socios;
	private static final int mayoriaDeEdad = 18;
	
	public ClubFutbol5() {
		this.socios = new ArrayList<>();
	}
	
	public ArrayList<Socio> getSociosYOrdenarPor(Filtro filtro, Comparator<Socio> comparador){
		ArrayList<Socio> resultado = new ArrayList<>();
		
		for(int i = 0; i < socios.size(); i++) {
			if(filtro.cumpleCondicion(socios.get(i))) { //Si cumple la condicion del filtro lo agrega
				resultado.add(socios.get(i));
			}
		}
		
		Collections.sort(resultado, comparador);//Ordena por el criterio del comparador que se paso por parametro
		return resultado;
	}
}
