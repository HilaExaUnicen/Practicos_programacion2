package practico8_Ej1;

public class FiltroPorCuotaPaga extends Filtro {

	@Override
	public boolean cumpleCondicion(Socio s) {
		return s.isPagoUltimaCuota();
	}
	
	
}
