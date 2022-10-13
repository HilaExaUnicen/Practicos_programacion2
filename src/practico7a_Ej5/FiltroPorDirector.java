package practico7a_Ej5;

public class FiltroPorDirector extends Filtro {
	
	private String directorAFiltrar;
	
	public FiltroPorDirector(String directorAFiltrar) {
		this.directorAFiltrar = directorAFiltrar;
	}
	
	@Override
	public boolean cumpleCondicion(Pelicula p) {
		return p.getDirector().equalsIgnoreCase(directorAFiltrar);
	}

}
