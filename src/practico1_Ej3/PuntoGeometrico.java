package practico1_Ej3;

public class PuntoGeometrico {
	
	private double x;
	private double y;
	
	public PuntoGeometrico(){
		this.x = 0;
		this.y = 0;
	}
	
	public PuntoGeometrico(double x, double y) {
		this.x = x;
		this.y = y;
	}

	
	public double calcularDistanciaEuclidea(PuntoGeometrico unPunto, PuntoGeometrico otroPunto) {
		double distanciaEuclidea;
		distanciaEuclidea = Math.pow((unPunto.getX() - otroPunto.getX()), 2) + Math.pow((unPunto.getY() - otroPunto.getY()), 2);
		
		return distanciaEuclidea;
	}
	
	
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public static void main(String[] args) {
		PuntoGeometrico punto1 = new PuntoGeometrico(2,4);
		PuntoGeometrico punto2 = new PuntoGeometrico(6,9);
		
		System.out.println(punto1.calcularDistanciaEuclidea(punto1, punto2));
	}
	
}