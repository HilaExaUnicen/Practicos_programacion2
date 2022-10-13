package practico7a_Ej5;

public class FiltroNot extends Filtro {
	private Filtro filtroANegar;

	public FiltroNot(Filtro f) {
		this.filtroANegar = f;
	}

	@Override
	public boolean cumpleCondicion(Pelicula p) {
		if(!filtroANegar.cumpleCondicion(p)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	
}
