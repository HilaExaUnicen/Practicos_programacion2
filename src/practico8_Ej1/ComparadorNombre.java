package practico8_Ej1;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Socio> {
	
	@Override
	public int compare(Socio soc1, Socio soc2) {
		return soc1.getNombre().compareTo(soc2.getNombre()); //Recordar que se utiliza el compareTo definido en la clase String
	}
}
