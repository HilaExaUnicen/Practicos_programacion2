package practico8_Ej4;

import java.util.ArrayList;

public class ElementoCompuestoVotacion extends ElementoVotacion {
	private ArrayList<Integer> votantesHabilitadosMesa;
	private ArrayList<ElementoVotacion> elementos;
	
	public ElementoCompuestoVotacion() {
		this.votantesHabilitadosMesa = new ArrayList<>();
		this.elementos = new ArrayList<>();
	}
	
	public void addVotanteAMesa(int dniVotante) {
		if(!this.mesaContieneVotante(dniVotante)){ //comprueba que no se agregue el mismo votante
			votantesHabilitadosMesa.add(dniVotante);
		}
	}
	
	public void addVoto(ElementoVotacion voto) { //Comprueba que no existan dos votos del mismo votante, se redefine el equals en Voto
		if(!this.elementos.contains(voto)) {
			elementos.add(voto);
		}
		else {
			System.out.println("El votante ya voto o no esta habilitado a votar en esta mesa.");
		}
	}
	
	public boolean mesaContieneVotante(int dniVotante) {
		return votantesHabilitadosMesa.contains(dniVotante);
	}
	
	@Override
	public int getCantVotosPor(Filtro filtro) {
		int resultadoSumadorVotos = 0;
		
		for(int i = 0; i < elementos.size(); i++) {
			ElementoVotacion votoIndex = elementos.get(i);
			resultadoSumadorVotos = resultadoSumadorVotos + votoIndex.getCantVotosPor(filtro);
		}
		
		return resultadoSumadorVotos;
	}
	
	@Override
	public int getCantTotalVotos() {
		return elementos.size();
	}
}
