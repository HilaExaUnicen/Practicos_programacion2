package practico6_Ej2;

public class Computadora extends ElementoOrdenable {
	private int memoria;
	
	public Computadora(int memoria) {
		this.memoria = memoria;
	}

	@Override
	public boolean esMayor(ElementoOrdenable e1) {
		if(this.getMemoria() > e1.getMemoria()) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getMemoria() {
		return memoria;
	}

	@Override
	public String toString() {
		return "Computadora [memoria=" + memoria + "]";
	}


	
	
}
