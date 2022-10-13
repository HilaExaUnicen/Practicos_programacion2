package practico7a_Ej2;

public class FiltroMinimoPalabrasClave extends Filtro {
	private int minimoPalabrasClave;
	
	public FiltroMinimoPalabrasClave(int minimoPalabrasClave) {
		this.minimoPalabrasClave = minimoPalabrasClave;
	}

	@Override
	public boolean cumpleCondicion(Documento doc) {
		if (doc.getCantPalabrasClave() >= this.minimoPalabrasClave) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
