package practico9_Ej6;

import java.util.ArrayList;
import java.util.Collections;

import practico9_Ej6.Filtros.Filtro;

public class Seccion extends ElementoCenso {

	private ArrayList<ElementoCenso> elementosTerritoriales;
	
	public Seccion(String nombre) {
		super(nombre);
		elementosTerritoriales = new ArrayList<>();
	}
	
	public void addElementoTerritorial(ElementoCenso elem) {
		this.elementosTerritoriales.add(elem);
	}
	
	@Override
	public int getSuperficie() {
		int sumador = 0;
		for(int i = 0; i < elementosTerritoriales.size(); i++) {
			sumador += elementosTerritoriales.get(i).getSuperficie();
		}
		
		return sumador;
	}
	@Override
	public int getCantHabitantes() {
		int sumador = 0;
		for(int i = 0; i < elementosTerritoriales.size(); i++) {
			sumador += elementosTerritoriales.get(i).getCantHabitantes();
		}
		
		return sumador;
	}
	@Override
	public double getMontoTotalIngresos() {
		int sumador = 0;
		for(int i = 0; i < elementosTerritoriales.size(); i++) {
			sumador += elementosTerritoriales.get(i).getMontoTotalIngresos();
		}
		
		return sumador;
	}
	@Override
	public double getIngresosPerCapita() {
		return (this.getMontoTotalIngresos() / this.getCantHabitantes());
	}
	
	@Override
	public double getDensidadDePoblacion() {
		return ( this.getCantHabitantes() / this.getSuperficie());
	}
	@Override
	public ArrayList<Comarca> getComarcaPor(Filtro f) {
		ArrayList<Comarca> resultado = new ArrayList<>();
		for(int i = 0; i < elementosTerritoriales.size();i++) {
			ArrayList<Comarca> comarcasHijas = elementosTerritoriales.get(i).getComarcaPor(f);
			resultado.addAll(comarcasHijas);
		}
		
		Collections.sort(resultado);
		
		return resultado;
	}

}
