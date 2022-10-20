package practico8_Ej1;

import java.util.Comparator;

public class ComparadorCantAlquileresPorCancha implements Comparator<Socio> {
	private int nroCanchaABuscar;
	
	public ComparadorCantAlquileresPorCancha(int nroCanchaABuscar) {
		this.nroCanchaABuscar = nroCanchaABuscar;
	}
	
	public int compare(Socio soc1, Socio soc2) {
		return soc1.getCantAlquileresCanchaNro(nroCanchaABuscar) - soc2.getCantAlquileresCanchaNro(nroCanchaABuscar);
	}
}
