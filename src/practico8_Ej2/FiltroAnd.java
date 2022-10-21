package practico8_Ej2;


public class FiltroAnd extends Filtro {
	Filtro f1;
	Filtro f2;
	
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumpleCondicion(ElementoSistemaArchivos elemento) {
		return f1.cumpleCondicion(elemento) && f2.cumpleCondicion(elemento); //Si ambos filtros cumplen la condicion devuelve true
	}
}
