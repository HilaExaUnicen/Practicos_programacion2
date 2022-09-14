package practico4_Ej4;

import java.util.ArrayList;

public class SeleccionDeFutbol {
	private String pais;
	private ArrayList <Contingente> contingente;
	
	public SeleccionDeFutbol(String pais) {
		this.pais = pais;
		contingente = new ArrayList<>();
	}
	
	public void addIntegrante(Contingente c) {
		contingente.add(c);
	}
	
	public String getPais() {
		return pais;
	}
	
	
}
