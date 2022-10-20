package practico8_Ej1;

import java.util.Comparator;

public class ComparadorAnd implements Comparator<Socio> {
	
	private Comparator<Socio> comparador1, comparador2;
	
	public ComparadorAnd(Comparator<Socio> c1, Comparator<Socio> c2) {
		this.comparador1 = c1;
		this.comparador2 = c2;
	}

	@Override
	public int compare(Socio soc1, Socio soc2) {
		int resultado = comparador1.compare(soc1, soc2);
		if(resultado == 0) {
			resultado = comparador2.compare(soc1, soc2);
		}
		
		return resultado;
	}
	
	
	
}
