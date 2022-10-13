package practico7a_Ej4;

public class FiltroPorCantLugaresMayoresA extends Filtro {

	private int cantDeLugaresMayorA;
	
	public FiltroPorCantLugaresMayoresA(int cantDeLugaresMayorA) {
		this.cantDeLugaresMayorA = cantDeLugaresMayorA;
	}
	
	@Override
	public boolean cumpleCondicion(Ficha f) {
		return f.getEspacioQueOcupa() > this.cantDeLugaresMayorA;
	}

}
