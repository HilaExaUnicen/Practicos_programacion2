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
		
		Pais p1 = new Pais();
		Pais p2 = new Pais();
		Provincia prov1 = new Provincia();
		Provincia prov2 = new Provincia();
		Ciudad ciudad1 = new Ciudad();
		Ciudad ciudad2 = new Ciudad();
		Barrio barrio1 = new Barrio();
		Barrio barrio2 = new Barrio();
		Barrio barrio3 = new Barrio();
		
		
		p1.addProvincia(prov1);
		p1.addProvincia(prov2);
		prov1.addCiudad(ciudad1);
		prov1.addCiudad(ciudad2);
		
		ciudad1.addBarrio(barrio1);
		barrio1.addBuzon(b1);
		barrio1.addBuzon(b2);
		barrio1.addBuzon(b3);
		
		ciudad2.addBarrio(barrio2);
		ciudad2.addBarrio(barrio3);
		barrio2.addBuzon(b4);
		barrio3.addBuzon(b5);
		
		b1.depositarCarta(c1);
		b1.depositarCarta(c2);
		b1.depositarCarta(c3);
		b2.depositarCarta(c4);
		b4.depositarCarta(c5);
		b4.depositarCarta(c6);
		b5.depositarCarta(c7);
		
		
		System.out.println(ciudad1.getCantTotalCartasRecibidas());
		
//		System.out.println(p1.getCantTotalCartasRecibidas());
//		System.out.println(p1.getCantCartasPor(new FiltroPorRegalo("Auto")));
	}
}
