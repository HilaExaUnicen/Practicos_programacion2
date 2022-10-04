package practico6_Ej2;

public class Proceso  extends ElementoOrdenable {
	private int memoriaRequerida;
	
	public Proceso (int memoriaRequerida) {
		this.memoriaRequerida = memoriaRequerida;
	}
	
	public int getMemoria() {
		return memoriaRequerida;
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

	@Override
	public String toString() {
		return "Proceso [memoriaRequerida=" + memoriaRequerida + "]";
	}
	
	
}
