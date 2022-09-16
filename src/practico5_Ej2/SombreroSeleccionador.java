package practico5_Ej2;

import java.util.ArrayList;

public class SombreroSeleccionador {
	private String nombre;
	private ArrayList<Casa> casas;
	
	public SombreroSeleccionador(String nombre) {
		this.nombre = nombre;
		casas = new ArrayList<>();
	}
	
	
	public static void main(String[] args) {
		Casa cas1= new Casa("Griffindor", 50);
		Casa cas2= new Casa("tuVieja", 10);
		Casa cas3= new Casa("Slytherin", 30);
		CasaExigente casaexi1 = new CasaExigente("Serpiente", 70);
		CasaEnemistada cEnemistada1 = new CasaEnemistada("Gallo", 70, "Griffindor");
		
		Alumno alumno1 = new Alumno("Harry", null, "22222222");
		Alumno alumno2 = new Alumno("El colorado", null, "1212222");
		Alumno alumno3 = new Alumno("Hermione", null, "22233422");
		Alumno alumno4 = new Alumno("El peluca", null, "42142222");
		Alumno alumno5 = new Alumno("Dumbledore", "Griffindor", "2332222");
		Alumno alumno6 = new Alumno("Lord valdomero", null, "94352222");
		
		alumno1.addFamiliar(alumno6);
		alumno1.addCualidad("Guadalupe");
		alumno1.addCualidad("Nutria");
		alumno1.addCualidad("Sape");
		
		
		cas1.addCualidadRequerida("Guadalupe");
		cas1.addCualidadRequerida("Sape");
		cas1.addCualidadRequerida("Nutria");
		
		cEnemistada1.addCualidadRequerida("Sape");
		
		casaexi1.addCualidadRequerida("Nutria");
		
		System.out.println(cEnemistada1.checkAlumnoEsApto(alumno1));
		System.out.println(cas1.checkAlumnoEsApto(alumno1));
		cas1.addAlumno(alumno1);
		System.out.println(alumno1.getCasa());
		System.out.println(cEnemistada1.checkAlumnoEsApto(alumno1));
		
	
		
	}
}
