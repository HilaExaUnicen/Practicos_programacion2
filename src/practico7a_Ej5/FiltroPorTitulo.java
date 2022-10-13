package practico7a_Ej5;

public class FiltroPorTitulo extends Filtro {

	private String tituloABuscar;
	
	public FiltroPorTitulo(String tituloABuscar) {
		this.tituloABuscar = tituloABuscar;
	}

	@Override
	public boolean cumpleCondicion(Pelicula p) {
		return p.getTitulo().equals(this.tituloABuscar);
	}

}
