package practico8_Ej1;

import java.util.Comparator;

public class ComparadorPorCuotaPaga implements Comparator<Socio> {

	@Override
	public int compare(Socio soc1, Socio soc2) {
		return Boolean.compare(soc1.isPagoUltimaCuota(), soc2.isPagoUltimaCuota());
	}
	
}
