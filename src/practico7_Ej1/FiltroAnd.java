package practico7_Ej1;

public class FiltroAnd extends Filtro {
	Filtro f1;
	Filtro f2;
	
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumpleCondicion(ProductoQuimico pq) {
		return f1.cumpleCondicion(pq) && f2.cumpleCondicion(pq); //Si ambos filtros cumplen la condicion devuelve true
	}
}
