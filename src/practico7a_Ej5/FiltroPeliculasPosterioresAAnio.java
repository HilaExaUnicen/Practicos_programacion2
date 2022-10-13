package practico7a_Ej5;

public class FiltroPeliculasPosterioresAAnio extends Filtro {

	private int posterioresAAnio;
	
	public FiltroPeliculasPosterioresAAnio(int posterioresAAnio) {
		super();
		this.posterioresAAnio = posterioresAAnio;
	}

	@Override
	public boolean cumpleCondicion(Pelicula p) {
		return p.getAnioEstreno() > this.posterioresAAnio;
	}

}
