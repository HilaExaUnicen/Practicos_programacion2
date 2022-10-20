package practico8_Ej1;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Socio> {

	
	public int compare(Socio soc1, Socio soc2) {
		return soc1.getEdad() - soc2.getEdad();
	}

}
