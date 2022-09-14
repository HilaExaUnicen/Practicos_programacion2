package practico4_Ej1yEj2;

public class Detector {
	
	private int numeroSensor;
	private String parteDeLaCasa;
	private boolean estaActivado;
	
	public Detector(int numeroSensor, String parteDeLaCasa) {
		this.numeroSensor = numeroSensor;
		this.parteDeLaCasa = parteDeLaCasa;
		this.estaActivado = false;
	}

	public int getNumeroSensor() {
		return numeroSensor;
	}

	public String getparteDeLaCasa() {
		return parteDeLaCasa;
	}
	
	public void seActivo() {
		this.estaActivado = true;
	}
	
	public void seDesactivo() {
		this.estaActivado = false;
	}

	public boolean estaActivado() {
		return estaActivado;
	}
	
	
	
	
	
	
}
