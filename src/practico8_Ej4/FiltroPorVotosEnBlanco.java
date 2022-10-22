package practico8_Ej4;

public class FiltroPorVotosEnBlanco extends Filtro {

	@Override
	public boolean cumpleCondicion(Voto voto) {
		if(voto.getCandidatoVotado() == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
