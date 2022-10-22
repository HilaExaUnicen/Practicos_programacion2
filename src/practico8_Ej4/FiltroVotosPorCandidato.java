package practico8_Ej4;

public class FiltroVotosPorCandidato extends Filtro {
	
	private Candidato candidatoBuscado;
	
	public FiltroVotosPorCandidato(Candidato candidatoBuscado) {
		this.candidatoBuscado = candidatoBuscado;
	}

	@Override
	public boolean cumpleCondicion(Voto voto) {
		return this.candidatoBuscado.equals(voto.getCandidatoVotado());
	}
		
}
