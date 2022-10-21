package practico8_Ej3;

import java.util.ArrayList;

public class Carta {
	private String dniRemitente;
	private ArrayList<String> regalos;
	
	
	public Carta(String dniRemitente) {
		this.dniRemitente = dniRemitente;
		this.regalos = new ArrayList<>();
	}

	public String getDniRemitente() {
		return dniRemitente;
	}
	
	public boolean equals(Object o) {
		try {
			Carta otra = (Carta) o;
			return this.dniRemitente.equals(otra.getDniRemitente());
		} 
		catch (Exception e) {
			return false;
		}
	}
	
	public void addRegalo(String regalo) {
		if(!regalos.contains(regalo)) {
			regalos.add(regalo);
		}
	}
	
	public boolean contieneRegalo(String regalo) {
		return regalos.contains(regalo);
	}
	
	public void borrarRegalosYAgregarCarbon() {
		this.regalos.clear();
		this.regalos.add("Trozo de carbon");
	}
	
	

}
