package practico3_Ej3;

//un nombre real, un nombre de super héroe y un conjunto de cualidades o 
//características, que son visión nocturna, velocidad, fuerza peso, altura y edad. Cada una 
//de estas posee un nivel asociado, por ejemplo velocidad 500, fuerza 700, edad 33.

public class Personaje {
	
	private String nombreReal, nombreSuperHeroe;
	private int velocidad, visionNocturna, fuerza, edad;
	private double altura, peso;
	

	public Personaje(String nombreReal, String nombreSuperHeroe, int velocidad, int visionNocturna, int fuerza,int edad, double altura, double peso) {
		this.nombreReal = nombreReal;
		this.nombreSuperHeroe = nombreSuperHeroe;
		this.velocidad = velocidad;
		this.visionNocturna = visionNocturna;
		this.fuerza = fuerza;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}
	
	


	@Override
	public String toString() {
		return  nombreSuperHeroe + ", velocidad="
				+ velocidad + ", visionNocturna=" + visionNocturna + ", fuerza=" + fuerza + ", edad=" + edad
				+ ", altura=" + altura + ", peso=" + peso;
	}




	public String getNombreSuperHeroe() {
		return nombreSuperHeroe;
	}




	public int getVelocidad() {
		return velocidad;
	}


	public int getVisionNocturna() {
		return visionNocturna;
	}


	public int getFuerza() {
		return fuerza;
	}
	
}
