package practico9_Ej6;

import java.util.ArrayList;

import practico9_Ej6.Filtros.Filtro;

public class Comarca extends ElementoCenso implements Comparable<Comarca>{
	private int superficie, cantHabitantes;
	private double montoTotalIngresos;
	
	public Comarca(String nombre, int superficie, int cantHabitantes, double montoTotalIngresos) {
		super(nombre);
		this.superficie = superficie;
		this.cantHabitantes = cantHabitantes;
		this.montoTotalIngresos = montoTotalIngresos;
	}

	public int getSuperficie() {
		return superficie;
	}

	public int getCantHabitantes() {
		return cantHabitantes;
	}

	public double getMontoTotalIngresos() {
		return montoTotalIngresos;
	}

	@Override
	public double getIngresosPerCapita() {
		return (montoTotalIngresos/cantHabitantes);
	}

	@Override
	public double getDensidadDePoblacion() {
		return (cantHabitantes / superficie);
	}

	@Override
	public ArrayList<Comarca> getComarcaPor(Filtro f) {
		ArrayList<Comarca> resultado = new ArrayList<>();
		if(f.cumpleCondicion(this)) {
			resultado.add(this);
		}
		
		return resultado;
	}

	@Override
	public int compareTo(Comarca otra) {
		return this.getNombre().compareTo(otra.getNombre());
	}
	

	
}
