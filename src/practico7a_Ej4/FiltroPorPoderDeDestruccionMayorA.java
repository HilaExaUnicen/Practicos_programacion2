package practico7a_Ej4;

public class FiltroPorPoderDeDestruccionMayorA extends Filtro {

	private int poderDeDestruccionMayorA;
	
	public FiltroPorPoderDeDestruccionMayorA(int poderDeDestruccionMayorA) {
		this.poderDeDestruccionMayorA = poderDeDestruccionMayorA;
	}

	@Override
	public boolean cumpleCondicion(Ficha ficha) {
		return ficha.getPoderDestruccion() > this.poderDeDestruccionMayorA;
	}

}
