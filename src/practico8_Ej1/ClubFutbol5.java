package practico8_Ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClubFutbol5 {
	private ArrayList<Socio> socios;
	
	public ClubFutbol5() {
		this.socios = new ArrayList<>();
	}
	
	public void addSocio(Socio s) {
		socios.add(s);
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
	
	
	public static void main(String[] args) {
		
		ClubFutbol5 club = new ClubFutbol5();
		
		Socio soc1 = new Socio("Juan", "Rodriguez", 17, true);
		Socio soc2 = new Socio("Jorge", "Rodriguez", 17, false);
		Socio soc3 = new Socio("Manuel", "Rodriguez", 17, false);
		Socio soc4 = new Socio("Juan", "Rodriguez", 17, true);
		
		Filtro f1 = new FiltroPorCuotaImpaga();
		
		Comparator <Socio> comp1 = new ComparadorApellido();
		Comparator <Socio> comp2 = new ComparadorNombre();
		
		Comparator <Socio> compAnd = new ComparadorAnd(comp1, comp2);
		
		club.addSocio(soc1);
		club.addSocio(soc2);
		club.addSocio(soc3);
		club.addSocio(soc4);
		
		System.out.println(club.getSociosYOrdenarPor(f1, compAnd));
	}
}
