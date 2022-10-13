package practico7a_Ej4;

public class Ficha {
	private int fortaleza, poderDestruccion, espacioQueOcupa;

	public Ficha(int fortaleza, int poderDestruccion, int espacioQueOcupa) {
		this.fortaleza = fortaleza;
		this.poderDestruccion = poderDestruccion;
		this.espacioQueOcupa = espacioQueOcupa;
	}
	
	public Ficha(int fortaleza, int espacioQueOcupa) {
		this.fortaleza = fortaleza;
		this.espacioQueOcupa = espacioQueOcupa;
	}

	public int getFortaleza() {
		return fortaleza;
	}

	public int getPoderDestruccion() {
		return poderDestruccion;
	}

	public int getEspacioQueOcupa() {
		return espacioQueOcupa;
	}
	
	
	
	
}
