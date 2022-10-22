package practico8_Ej4;

import java.util.Comparator;

public class ComparadorCandidatos implements Comparator<Candidato> {

	@Override
	public int compare(Candidato c1, Candidato c2) {
		int resultado = c1.getPartidoPolitico().compareTo(c2.getPartidoPolitico());
		if(resultado == 0) {
			resultado = c1.getAgrupacion().compareTo(c2.getAgrupacion());
		}
		
		return resultado;
	}

}
