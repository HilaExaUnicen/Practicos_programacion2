package practico8_Ej4;

import java.time.LocalTime;

public class Voto {
	private Candidato candidatoVotado;
	private Votante personaQueEmitioElVoto;
	private LocalTime horaVotoFueEfectuado;
	
	
	public Voto(Candidato candidatoVotado, LocalTime horaVotoFueEfectuado, Votante votante) {
		this.candidatoVotado = candidatoVotado;
		this.horaVotoFueEfectuado = horaVotoFueEfectuado;
		this.personaQueEmitioElVoto = votante;
	}


	public Candidato getCandidatoVotado() {
		return candidatoVotado;
	}


	public Votante getPersonaQueEmitioElVoto() {
		return personaQueEmitioElVoto;
	}


	public LocalTime getHoraVotoFueEfectuado() {
		return horaVotoFueEfectuado;
	}
	
	public boolean equals(Object o) {
		try {
			Voto otro = (Voto) o;
			return this.personaQueEmitioElVoto.getDni() == otro.personaQueEmitioElVoto.getDni();
		}
		catch (Exception e) {
			return false;
		}
	}
	
	
	
	
}
