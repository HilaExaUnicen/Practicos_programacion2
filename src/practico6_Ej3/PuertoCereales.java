package practico6_Ej3;

public class PuertoCereales {
	ColaElementos barcos;
	ColaElementos camiones; 
	
	public PuertoCereales() {
		this.barcos = new ColaElementos();
		this.camiones = new ColaElementos();
	}

	public void addCamion(Camion c) {
		camiones.addElemento(c);
	}
	
	public void addBarco(Barco b) {
		camiones.addElemento(b);
	}
	
	public void imprimirCamiones() {
		System.out.println(camiones.toString());
	}
	
	public void imprimirBarcos() {
		System.out.println(barcos.toString());
	}
	
	public void descargarCamion() {
		camiones.siguiente();
	}
	
	public void cargarBarco() {
		Barco barcoCargado = (Barco) barcos.siguiente();//Como devuelve un elementoOrdenable hay que castearlo
		System.out.println("Se ha cargado el barco " + barcoCargado.getNombre());
	}
}
