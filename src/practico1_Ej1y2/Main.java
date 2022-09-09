package practico1_Ej1y2;

import java.time.LocalDate;
import java.time.Period;


public class Main {
	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		Period unDia = Period.ofDays(1);
		LocalDate tomorrow = hoy.plus(unDia);
		
		Persona nuevaPersona = new Persona(11111111, "Alberto", "Gomez");
		Persona otraPersona = new Persona(44444444);
		
		System.out.println(nuevaPersona.returnStringConInfo());
		System.out.println("Es mayor: " +nuevaPersona.esMayorDeEdadONo());
		System.out.println("Cumple años: " + nuevaPersona.cumpleAniosONo());
		System.out.println("Coincide fecha con edad: " + nuevaPersona.fechaNacCoincideConEdad());
		System.out.println("Hoy es " + hoy);
		System.out.println("Mañana es " + tomorrow);
		
	}

}
