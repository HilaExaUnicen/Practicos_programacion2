package practico6_Ej3;

public class Barco implements ElementoOrdenable {
	private String nombre;
	private double toneladasCapacidad;
	
	public Barco(String nombre, double toneladasCapacidad) {
		this.nombre = nombre;
		this.toneladasCapacidad = toneladasCapacidad;
	}

	@Override
	public boolean esMayor(ElementoOrdenable e1) {
		Barco otro = (Barco) e1;
		if(this.toneladasCapacidad > otro.getToneladasCapacidad()) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", toneladasCapacidad=" + toneladasCapacidad;
	}

	public String getNombre() {
		return nombre;
	}

	public double getToneladasCapacidad() {
		return toneladasCapacidad;
	}
	
	
	
	
}
