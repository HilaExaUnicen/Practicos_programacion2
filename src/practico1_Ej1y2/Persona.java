package practico1_Ej1y2;

import java.time.LocalDate;
import java.time.Period;

	
public class Persona {
		private String nombre;
		private String apellido;
		private int edad;
		private LocalDate fechaNacimiento;
		private int dni;
		private char sexo;
		private int peso;
		private double altura;
		
		
		public Persona(int dni) {
			nombre = "N";
			apellido = "N";
			edad = 18;
			peso = 1;
			altura = 1;
			fechaNacimiento = LocalDate.of(2000, 1, 1);
			sexo = 'F';
			this.dni = dni;
		}
		
		public Persona(int dni, String nombre, String apellido) {
			this.nombre = nombre;
			this.apellido = apellido;
			edad = 21;
			peso = 1;
			altura = 1;
			fechaNacimiento = LocalDate.of(2000, 9, 6);
			sexo = 'F';
			this.dni = dni;
		}
		
		public Persona(int dni, String nombre, String apellido, LocalDate fechaNacimiento) {
			this.nombre = nombre;
			this.apellido = apellido;
			edad = 10;
			peso = 1;
			altura = 1;
			this.fechaNacimiento = fechaNacimiento;
			sexo = 'F';
			this.dni = dni;
		}
		
		
		public String returnStringConInfo() {
			return nombre + " - " + apellido + " - " + dni + " " + fechaNacimiento;
		}
		
		public double getIMC(int peso, double altura) {
			double imc;
			imc = (peso/Math.pow(altura, 2));
			return imc;
		}
		
		public boolean enFormaONo() {
			double imc = this.getIMC(peso, altura);
			
			if(imc >= 18.5 && imc <= 25) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public boolean fechaNacCoincideConEdad() {
			LocalDate hoy = LocalDate.now();
			Period periodo = Period.between(fechaNacimiento, hoy);
			int anios = periodo.getYears();
			
			if(edad == anios) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public boolean esMayorDeEdadONo() {
			if(edad >= 18) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public String cumpleAniosONo() {
			LocalDate hoy = LocalDate.now();
			
			if((fechaNacimiento.getMonth().equals(hoy.getMonth()) && (fechaNacimiento.getDayOfMonth() == hoy.getDayOfMonth()))){
				return "Feliz cumpleaños " + nombre + "!";
			}
			else {
				LocalDate fechaCumpleanios = LocalDate.of(hoy.getYear(), fechaNacimiento.getMonth(), fechaNacimiento.getDayOfMonth());
				Period periodo = Period.between(hoy, fechaCumpleanios);
				
				return "para tu cumpleaños faltan " + periodo.getDays() + " dias"; //esta incompleto solo funciona si la fecha de cumpleanios no paso en el anio corriente;
			}
		}
		
		public boolean puedeVotarONo(int edad) {
			if(edad >= 16) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
		
	}