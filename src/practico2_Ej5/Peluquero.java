package practico2_Ej5;

import java.time.LocalDate;
import java.time.Period;

public class Peluquero {
	 private String nombre;
	 private LocalDate fechaNacimiento;
	 private int edad;
	 
	 public Peluquero(String nombre, LocalDate fechaNacimiento) {
		 LocalDate fechaHoy = LocalDate.now();
		 Period edadPeluquero = Period.between(fechaNacimiento, fechaHoy); 
		 this.nombre = nombre;
		 this.fechaNacimiento = fechaNacimiento;
		 
		 this.edad = edadPeluquero.getYears();
	 }
}
