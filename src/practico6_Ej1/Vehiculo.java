package practico6_Ej1;

public class Vehiculo extends Item {
	private String marca, tipoCombustible, patente;
	private int cantKm;
	private boolean estaAlquilado;
	
	
	public Vehiculo(String marca, String tipoCombustible, String patente, int cantKm) {
		super();
		this.marca = marca;
		this.tipoCombustible = tipoCombustible;
		this.patente = patente;
		this.cantKm = cantKm;
		this.estaAlquilado = false;
	}

	@Override
	public boolean puedeAlquilarse() {
		if(this.estaAlquilado == false) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public void ponerEnAlquiler() {
		this.estaAlquilado = true;	
	}
	
	public String getPatente() {
		return patente;
	}

	@Override
	public void itemDevuelto() {
		this.estaAlquilado = false;
	}
}

