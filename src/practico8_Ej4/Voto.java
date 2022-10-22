package practico8_Ej4;

import java.time.LocalDate;

public class Voto {
	private Candidato candidatoVotado;
	private Votante personaQueEmitioElVoto;
	private LocalDate horaVotoFueEfectuado;
	
	
	public Voto(Candidato candidatoVotado, LocalDate horaVotoFueEfectuado, Votante votante) {
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


	public LocalDate getHoraVotoFueEfectuado() {
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
