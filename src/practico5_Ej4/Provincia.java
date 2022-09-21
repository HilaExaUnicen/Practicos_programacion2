package practico5_Ej4;

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
	
	public static void main(String[] args) {
		Provincia buenosAires = new Provincia ("Buenos Aires");
		Ciudad tandil = new Ciudad (buenosAires, "Tandil", 120000, 94000);
		Ciudad olavarria = new Ciudad(buenosAires, "Olavarria", 110000, 800000);
		Ciudad rauch = new Ciudad (buenosAires, "Rauch", 13000, 250000);
		Ciudad junin = new Ciudad (buenosAires, "Junin", 115000, 0);
		Ciudad pergamino = new Ciudad(buenosAires, "Pergamino", 110000, 0);
		Ciudad marDelPlata = new Ciudad (buenosAires, "Mar del Plata", 500000, 0);
		Ciudad laPlata = new Ciudad(buenosAires, "La plata", 400000, 0);
		
		
		buenosAires.insertCiudad(tandil);
		buenosAires.insertCiudad(olavarria);
		buenosAires.insertCiudad(rauch);
		buenosAires.insertCiudad(junin);
		buenosAires.insertCiudad(pergamino);
		buenosAires.insertCiudad(marDelPlata);
		buenosAires.insertCiudad(laPlata);
		
		Contribuyente c1 = new Contribuyente("pepe", "4244", 20000);
		Contribuyente c2 = new Contribuyente("pepe", "4244", 30000);
		Contribuyente c3 = new Contribuyente("pepe", "4244", 35061);
		Contribuyente c4 = new Contribuyente("pepe", "4244", 31230);
		
		ContribuyenteProgramador c5 = new ContribuyenteProgramador("pepe", "4244", 2000, 1000);
		
		tandil.insertarContribuyente(c1);
		tandil.insertarContribuyente(c2);
		tandil.insertarContribuyente(c3);
		tandil.insertarContribuyente(c4);
		tandil.insertarContribuyente(c5);
		
		System.out.println("La ciudad de " + tandil.getNombre() + " es deficitaria: " + tandil.esDeficitaria());
		System.out.println("La ciudad de " + olavarria.getNombre() + " es deficitaria: " + olavarria.esDeficitaria());

		
		System.out.println("La provincia de Buenos Aires tiene " + buenosAires.getCantidadCiudadesMasDeCienMilHab() + " ciudades con mas de 100000 habitantes");
		System.out.println("La provincia de " + buenosAires.getNombre() + " es deficitaria: " + buenosAires.provinciaEsDeficitaria());
		
	}
}