package practico2_Ej3;

public class MainControlGastos {

	public static void main(String[] args) {
		Provincia buenosAires = new Provincia ("Buenos Aires");
		
		Ciudad tandil = new Ciudad (buenosAires, "Tandil", 120000, 94000);
		Ciudad olavarria = new Ciudad(buenosAires, "Olavarria", 110000, 800000);
		Ciudad rauch = new Ciudad (buenosAires, "Rauch", 13000, 250000);
		Ciudad junin = new Ciudad (buenosAires, "Junin", 115000, 0);
		Ciudad pergamino = new Ciudad(buenosAires, "Pergamino", 110000, 0);
		Ciudad marDelPlata = new Ciudad (buenosAires, "Mar del Plata", 500000, 0);
		Ciudad laPlata = new Ciudad(buenosAires, "La plata", 400000, 0);
		
		
		buenosAires.insertCiudad(tandil);
		buenosAires.insertCiudad(olavarria);
		buenosAires.insertCiudad(rauch);
		buenosAires.insertCiudad(junin);
		buenosAires.insertCiudad(pergamino);
		buenosAires.insertCiudad(marDelPlata);
		buenosAires.insertCiudad(laPlata);
		
		
		Impuesto imp1 = new Impuesto ("imp1", 2000);
		tandil.insertarImpuesto(imp1);
		Impuesto imp2 = new Impuesto ("imp2", 40000);
		tandil.insertarImpuesto(imp2);
		Impuesto imp3 = new Impuesto ("imp3", 30000); //En este ejemplo hardcodeado la recaudacion es de 94000,
		tandil.insertarImpuesto(imp3);				  //y solo se cargan impuestos para la ciudad de tandil
		Impuesto imp4 = new Impuesto ("imp4", 20000);
		tandil.insertarImpuesto(imp4);
		Impuesto imp5 = new Impuesto ("imp5", 2000);
		tandil.insertarImpuesto(imp5);
		
		System.out.println("La ciudad de " + tandil.getNombre() + " es deficitaria: " + tandil.esDeficitaria());
		System.out.println("La ciudad de " + olavarria.getNombre() + " es deficitaria: " + olavarria.esDeficitaria());

		
		System.out.println("La provincia de Buenos Aires tiene " + buenosAires.getCantidadCiudadesMasDeCienMilHab() + " ciudades con mas de 100000 habitantes");
		System.out.println("La provincia de " + buenosAires.getNombre() + " es deficitaria: " + buenosAires.provinciaEsDeficitaria());
	}

}
