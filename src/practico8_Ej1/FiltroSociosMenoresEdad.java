package practico8_Ej1;

public class FiltroSociosMenoresEdad extends Filtro {
	private static final int mayoriaEdad = 18;

	@Override
	public boolean cumpleCondicion(Socio s) {
		return s.getEdad() < mayoriaEdad;
	}
	
	
}
