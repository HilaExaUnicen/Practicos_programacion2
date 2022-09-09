package practico2_Ej3;

import java.util.ArrayList;

public class Provincia {

	private String nombre;
	private ArrayList <Ciudad> ciudades = new ArrayList();
	
	public Provincia (String nombre) {
		this.nombre = nombre;
	}
	
	
	public void insertCiudad(Ciudad ciudad) {
		ciudades.add(ciudad);
	}
	
	public int getCantidadCiudadesMasDeCienMilHab() {
		int cantCiudades = 0;
		
		for(int i = 0; i < ciudades.size(); i++) {
			if(ciudades.get(i).getHabitantes() >= 100000) {
				cantCiudades++;
			}
		}
		
		return cantCiudades;
	}
	
	public boolean provinciaEsDeficitaria() { //Este metodo retorna true si mas de la mitad de las ciudades de la provincia son deficitarias
		int contador = 0;
		int cantCiudadesGrandes = this.getCantidadCiudadesMasDeCienMilHab();
		
		for(int i = 0; i < ciudades.size();i++) {
			if(ciudades.get(i).esDeficitaria() == true) {
				contador++;
			}
		}
		
		if(contador > (cantCiudadesGrandes/2)) { 
			return true;
		}
		else {
			return false;
		}
		
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
}