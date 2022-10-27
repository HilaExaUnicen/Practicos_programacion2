package practico8_Ej3;

public class Main {
	public static void main(String[] args) {
	
		Carta c1 = new Carta("1");
		Carta c2 = new Carta("2");
		Carta c3 = new Carta("3");
		Carta c4 = new Carta("4");
		Carta c5 = new Carta("5");
		Carta c6 = new Carta("6");
		Carta c7 = new Carta("7");
		
		c1.addRegalo("Auto");
		c2.addRegalo("Pelota");
		
		Buzon b1 = new Buzon();
		Buzon b2 = new Buzon();
		Buzon b3 = new Buzon();
		Buzon b4 = new Buzon();
		Buzon b5 = new Buzon();
		
		b1.addNinioBueno("1");
		
		Zona pais1 = new Zona();
		Zona provincia1 = new Zona();
		
		pais1.addElemento(provincia1);
		pais1.addElemento(b1);
		pais1.addElemento(b2);
		pais1.addElemento(b3);
		pais1.addElemento(b4);
		pais1.addElemento(b5);
		
		b1.depositarCarta(c1);
		b1.depositarCarta(c2);
		b1.depositarCarta(c3);
		b2.depositarCarta(c4);
		b4.depositarCarta(c5);
		b4.depositarCarta(c6);
		b5.depositarCarta(c7);
		
		
		System.out.println(pais1.getCantTotalCartasRecibidas());
		System.out.println(provincia1.getCantTotalCartasRecibidas());
		
//		System.out.println(p1.getCantTotalCartasRecibidas());
//		System.out.println(p1.getCantCartasPor(new FiltroPorRegalo("Auto")));
	}
}
