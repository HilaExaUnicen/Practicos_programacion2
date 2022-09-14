package practico4_Ej1yEj2;

public class AlarmaLuminosa extends Alarma {
	
	
	public AlarmaLuminosa() {
		super();
	}

	
	public void comprobar() {
		if(this.estaActivada()) {
			this.comprobar();
			//luz.encenderLuz();
		}
		else {
			if(this.algunDetectorActivado()) {
				//luz.encenderLuz();
			}
		}
	}
}
