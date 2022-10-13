package practico7a_Ej5;

public class FiltroPorGenero extends Filtro {
	private String generoAFiltrar;

	public FiltroPorGenero(String generoAFiltrar) {
		this.generoAFiltrar = generoAFiltrar;
	}

	@Override
	public boolean cumpleCondicion(Pelicula p) {
		return p.contieneGenero(this.generoAFiltrar);
	}
	
	
}
