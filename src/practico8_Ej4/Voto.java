package practico8_Ej4;

import java.time.LocalTime;

public class Voto extends ElementoVotacion {
	private Candidato candidatoVotado;
	private LocalTime horaVotoFueEfectuado;
	private int dniVotante;
	
	
	public Voto(Candidato candidatoVotado, LocalTime horaVotoFueEfectuado, int dni) {
		this.candidatoVotado = candidatoVotado;
		this.horaVotoFueEfectuado = horaVotoFueEfectuado;
		this.dniVotante = dni;
	}


	public Candidato getCandidatoVotado() {
		return candidatoVotado;
	}


	public int getDniVotante() {
		return dniVotante;
	}


	public LocalTime getHoraVotoFueEfectuado() {
		return horaVotoFueEfectuado;
	}
	
	public boolean equals(Object o) {
		try {
			Voto otro = (Voto) o;
			return this.dniVotante == otro.getDniVotante();
		}
		catch (Exception e) {
			return false;
		}
	}


	@Override
	public int getCantVotosPor(Filtro f) {
		if(f.cumpleCondicion(this)) {
			return 1;
		}
		else {
			return 0;
		}
	}


	@Override
	public int getCantTotalVotos() {
		return 1;
	}
	
	
	
	
}
