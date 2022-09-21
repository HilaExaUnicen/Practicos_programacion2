package practico5_Ej4;

import java.util.ArrayList;

public class Ciudad {
	private String nombre;
	private String provincia;
	private int habitantes;
	private ArrayList<Contribuyente> contribuyentes; 
	
	private float montoGastado;
	
	
	public Ciudad(Provincia provincia, String nombre, int habitantes, float montoGastado) {
		this.nombre = nombre;
		this.provincia = provincia.getNombre();
		this.habitantes = habitantes;
		this.montoGastado = montoGastado;
		contribuyentes = new ArrayList();
	}
	
	public void insertarContribuyente(Contribuyente c) {
		if(this.habitantes >= 100000) {
			contribuyentes.add(c);
		}
	}
	
	public float getRecaudacionTotal() {
		float recaudacionTotal = 0;
		if(this.habitantes >= 100000) {
			for(int i = 0; i < contribuyentes.size();i++) {
				recaudacionTotal += contribuyentes.get(i).getMontoAPagar();
			}
		}
		return recaudacionTotal;
	}
	
	public boolean esDeficitaria() {
		float recaudacionTotal = getRecaudacionTotal();
		float diferencia = (recaudacionTotal - this.montoGastado);
		
		if(diferencia >= 0) { //Si gasto menos o lo mismo que la recaudacion total no tiene deficit.
			return false;
		}
		else {
			return true;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public int getHabitantes() {
		return habitantes;
	}
}
