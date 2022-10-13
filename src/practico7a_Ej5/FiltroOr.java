package practico7a_Ej5;

public class FiltroOr extends Filtro {
	Filtro f1;
	Filtro f2;
	
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumpleCondicion(Pelicula p) {
		return f1.cumpleCondicion(p) || f2.cumpleCondicion(p); 
	}
}