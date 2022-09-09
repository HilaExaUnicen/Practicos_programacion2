package practico3_Ej4;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Celular {
	private String nombreCelular;
	private ArrayList <Contacto> contactos;
	private ArrayList <Contacto> contactosRepetidos;
	private static LocalDate FECHAHOY = LocalDate.now();
	
	
	public Celular(String celular) {
		this.nombreCelular = celular;
		contactos = new ArrayList();
		contactosRepetidos = new ArrayList();
	}
	
	public void agregarContacto(Contacto c) {
		if(this.isContactoRepetido(c) == false) {
			contactos.add(c);
		}else {
			System.out.println("Ya existe un contacto con el nombre, apellido y numero de telefono ingresados.");
		}
		
	}
	
	public boolean isContactoRepetido(Contacto c) {
		for(int i = 0; i < contactos.size(); i++) {
			if(contactos.get(i).getNumTelefono().equals(c.getNumTelefono())) {
				if(contactos.get(i).getNombre().equals(c.getNombre()) && contactos.get(i).getApellido().equals(c.getApellido())) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void listarContactos() {
		for(int i = 0; i < contactos.size(); i++) {
			LocalDate fechaNacContacto = contactos.get(i).getFechaNacimiento();
			Period periodo = Period.between(fechaNacContacto, FECHAHOY);
			int edad = periodo.getYears();
			
			System.out.println(contactos.get(i).getNombre() + " " + contactos.get(i).getApellido());
			System.out.println("Edad: " + edad + " Tel: " + contactos.get(i).getNumTelefono());
			System.out.println("");
		}
	}
	
	public double getPromedioEdadContactos() {
		int suma = 0;
		double promedio = 0;
		
		for(int i = 0; i < contactos.size(); i++) {
			LocalDate fechaNacContacto = contactos.get(i).getFechaNacimiento();
			Period periodo = Period.between(fechaNacContacto, FECHAHOY);
			int edad = periodo.getYears();
			suma = (suma + edad);
		}
		
		promedio = (suma/contactos.size());
		return promedio;
	}
	
	
	public int getCantidadContactos() {
		return contactos.size();
	}
	
	public static void main(String[] args) {
		Celular cel1 = new Celular("Celular 1");
		
		Contacto c1 = new Contacto("Agustin", "Rossi", "11555555", "Viamonte 555", "rossi@gmail.com", LocalDate.of(1995, 5, 9));
		cel1.agregarContacto(c1);
		Contacto c2 = new Contacto("Exequiel", "Zeballos", "11553355", "Brandsen 555", "zeballos@gmail.com", LocalDate.of(2001, 5, 9));
		cel1.agregarContacto(c2);
		Contacto c3 = new Contacto("Dario", "Benedetto", "11998555", "Brandsen 955", "pipa@gmail.com", LocalDate.of(1990, 11, 9));
		cel1.agregarContacto(c3);
		Contacto c4 = new Contacto("Juan", "Rodriguez", "11555555", "San martin 2000", "juan@gmail.com", LocalDate.of(1980, 1, 9));
		cel1.agregarContacto(c4);
		Contacto c5 = new Contacto("Dario", "Benedetto", "11998555", "Brandsen 959", "pipab@gmail.com", LocalDate.of(1990, 1, 19));
		cel1.agregarContacto(c5);
		
		System.out.println("Cantidad total contactos: " + cel1.getCantidadContactos());
		cel1.listarContactos();
		
	}
	
	
	
	
}