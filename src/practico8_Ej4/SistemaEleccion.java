package practico8_Ej4;

import java.util.ArrayList;
import java.util.Collections;

public class SistemaEleccion {
	ArrayList<Candidato> candidatos;
	ArrayList<Localidad> localidades;
	
	public SistemaEleccion() {
		this.candidatos = new ArrayList<>();
		this.localidades = new ArrayList<>();
	}
	
	public void addCandidato(Candidato c) {
		if(!candidatos.contains(c)) {
			candidatos.add(c);
		}
	}
	
	public ArrayList<Candidato> getCandidatos(){
		ArrayList<Candidato> resultado = candidatos;
		
		Collections.sort(resultado, new ComparadorCandidatos());
		
		return resultado;
	}
	
//	public int getCantTotalVotos() {
//		int sumadorCantTotal = 0;
//		return sumadorCantTotal;
//	}
}
