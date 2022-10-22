package practico8_Ej4;

import java.util.ArrayList;

public class MesaVotacion extends ElementoVotacion {
	private ArrayList<Votante> votantesHabilitadosMesa;
	private ArrayList<Voto> urnaDeVotos;
	
	public MesaVotacion() {
		this.votantesHabilitadosMesa = new ArrayList<>();
		this.urnaDeVotos = new ArrayList<>();
	}
	
	public void addVotanteAMesa(Votante votante) {
		if(!this.mesaContieneVotante(votante)){ //comprueba que no se agregue el mismo votante, se redefine el equals en votante
			votantesHabilitadosMesa.add(votante);
		}
	}
	
	public void addVoto(Voto voto) { //Comprueba que no existan dos votos del mismo votante, se redefine el equals en Voto
		if(!this.urnaDeVotos.contains(voto)) {
			urnaDeVotos.add(voto);
		}
	}
	
	public boolean mesaContieneVotante(Votante votante) {
		return votantesHabilitadosMesa.contains(votante);
	}
	
	@Override
	public int getCantVotosPor(Filtro filtro) {
		int resultadoSumadorVotos = 0;
		
		for(int i = 0; i < urnaDeVotos.size(); i++) {
			Voto votoIndex = urnaDeVotos.get(i);
			if(filtro.cumpleCondicion(votoIndex)) {
				resultadoSumadorVotos++;
			}
		}
		
		return resultadoSumadorVotos;
	}
	
	@Override
	public int getCantTotalVotos() {
		return urnaDeVotos.size();
	}
}
