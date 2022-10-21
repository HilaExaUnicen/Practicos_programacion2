package practico8_Ej3;

public class FiltroPorNiniosMalos extends Filtro{

	@Override
	public boolean cumpleCondicion(Carta c) {
		return c.contieneRegalo("Trozo de carbon");
	}
	
	
	
}
