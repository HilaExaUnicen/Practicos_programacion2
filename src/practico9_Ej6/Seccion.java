package practico9_Ej6;

import java.util.ArrayList;

import practico9_Ej6.Filtros.Filtro;

public class Seccion extends ElementoCenso {

	private ArrayList<ElementoCenso> elementosTerritoriales;
	public Seccion(String nombre) {
		super(nombre);
		elementosTerritoriales = new ArrayList<>();
	}
	@Override
	public int getSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int cantHabitantes() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getMontoTotalIngresos() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getIngresosPerCapita() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getDensidadDePoblacion() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ArrayList<Comarca> getComarcaPor(Filtro f) {
		// TODO Auto-generated method stub
		return null;
	}

}
