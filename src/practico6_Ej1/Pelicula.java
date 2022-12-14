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
			return true;
		}
		else {
			return false;
		}
	}

	public void ponerEnAlquiler() {
		this.cantCopias--;
	}

	@Override
	public void itemDevuelto() {
		this.cantCopias++;	
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public int getCantCopias() {
		return cantCopias;
	}
	
	
}
