package practico6_Ej1;

public class Vehiculo extends Item {
	private String marca, tipoCombustible, patente;
	private double cantKm;
	
	
	public Vehiculo(String marca, String tipoCombustible, String patente, double cantKm) {
		super();
		this.marca = marca;
		this.tipoCombustible = tipoCombustible;
		this.patente = patente;
		this.cantKm = cantKm;
	}


	@Override
	public boolean puedeAlquilarse() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public boolean equals(Object o) {
		return false; //TODO
	}

}
