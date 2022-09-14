package practico4_Ej1yEj2;

import java.util.ArrayList;

public class Alarma {
	private boolean estaActivada;
	private ArrayList<Detector> detectores;
	
	public Alarma() {
		this.estaActivada = false;
		this.detectores = new ArrayList();
	}
	
	public void activarAlarma() {
		this.estaActivada = true;
	}
	
	public void desactivarAlarma() {
		this.estaActivada = false;
	}
	
	public void comprobar() {
		if(this.estaActivada()) {
			if(this.algunDetectorActivado() == true) {   //==true no es necesario, solo esta para que quede mas claro;
				//timbre.hacerSonar();
			}
		}
	} 
	
	
	public boolean algunDetectorActivado() {
		for(int i = 0; i < detectores.size();i++) {
			if(detectores.get(i).estaActivado() == true) {//==true no es necesario, solo esta para que quede mas claro;
				System.out.println("Se activo el sensor numero " + detectores.get(i).getNumeroSensor() + " del sector" + detectores.get(i).getparteDeLaCasa());
				return true;
			}
		}
		return false;
	}
	
	public void agregarDetector(Detector d) {
		detectores.add(d);
	}
	
	public boolean estaActivada() {
		return this.estaActivada;
	}
	
	
}
