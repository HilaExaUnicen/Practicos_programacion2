package practico8_Ej1;

public class FiltroPorCuotaImpaga extends Filtro {

	@Override
	public boolean cumpleCondicion(Socio s) {
		if(s.isPagoUltimaCuota() == false) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
