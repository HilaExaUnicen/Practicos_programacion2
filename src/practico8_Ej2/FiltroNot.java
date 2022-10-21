package practico8_Ej2;

public class FiltroNot extends Filtro {
	
	private Filtro f1;

	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumpleCondicion(ElementoSistemaArchivos elemento) {
		return !f1.cumpleCondicion(elemento);
	}
	
	
	
	
	
	
}
