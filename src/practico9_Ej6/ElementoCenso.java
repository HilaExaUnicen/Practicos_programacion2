package practico9_Ej6;

import java.util.ArrayList;
import  practico9_Ej6.Filtros.*;

public abstract class ElementoCenso {
	private String nombre;

	public ElementoCenso(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract int getSuperficie();
	public abstract int getCantHabitantes();
	public abstract double getMontoTotalIngresos();
	public abstract double getIngresosPerCapita();
	public abstract double getDensidadDePoblacion();
	public abstract ArrayList<Comarca> getComarcaPor(Filtro f);
	
	
}
