package practico6_Ej1;

public class Pelicula extends Item {
	private String titulo;
	private int cantCopias;
	
	public Pelicula(String titulo, int cantCopias) {
		super();
		this.titulo = titulo;
		this.cantCopias = cantCopias;
	}

	@Override
	public boolean puedeAlquilarse() {
		if(this.cantCopias > 0) {
			this.restarPeliculaCantCopias();
			return true;
		}
		else {
			return false;
		}
	}
	
	public void restarPeliculaCantCopias() {
		this.cantCopias--;
	}
	
	
}
