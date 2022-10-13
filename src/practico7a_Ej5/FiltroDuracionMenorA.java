package practico7a_Ej5;

public class FiltroDuracionMenorA extends Filtro {

	private int duracionMaxima;
	
	public FiltroDuracionMenorA(int duracionMaxima) {
		this.duracionMaxima = duracionMaxima;
	}

	@Override
	public boolean cumpleCondicion(Pelicula p) {
		return p.getDuracion() < this.duracionMaxima;
	}

}
