package practico2_Ej4;

import java.time.LocalDate;
import java.time.LocalTime;

public class MainEstablecimiento {

	public static void main(String[] args) {
		Establecimiento est = new Establecimiento("Canchas Sintenticas");
		
		Cancha canchaFutbol = new Cancha("Futbol");
		Cancha canchaPaddle = new Cancha("Paddle");
		
		Usuario juan = new Usuario("Juan");
		Usuario pablo = new Usuario("Pablo");
		
		Turno turno1 = new Turno(LocalDate.of(2022, 8, 1), LocalTime.of(16, 0), canchaFutbol, juan, est);
		Turno turno2 = new Turno(LocalDate.of(2022, 8, 12), LocalTime.of(16, 0), canchaFutbol, juan, est);
		Turno turno3 = new Turno(LocalDate.of(2022, 8, 23), LocalTime.of(16, 0), canchaFutbol, juan, est);
		Turno turno4 = new Turno(LocalDate.of(2022, 8, 30), LocalTime.of(16, 0), canchaFutbol, juan, est);
		est.addTurno(turno1);
		est.addTurno(turno2);
		est.addTurno(turno3);
		est.addTurno(turno4);
		Turno turno5 = new Turno(LocalDate.of(2022, 8, 1), LocalTime.of(16, 0), canchaFutbol, juan, est);
		est.addTurno(turno5);
		
		Turno turno6 = new Turno(LocalDate.of(2022, 8, 1), LocalTime.of(18, 0), canchaPaddle, juan, est);
		est.addTurno(turno6);
		
		Turno turno7 = new Turno(LocalDate.of(2022, 8, 1), LocalTime.of(20, 30), canchaFutbol, pablo, est);
		est.addTurno(turno7);
		
		System.out.println(turno1.getPrecio());
		System.out.println(turno2.getPrecio());
		System.out.println(turno3.getPrecio());
		System.out.println(turno4.getPrecio());
		System.out.println(turno5.getPrecio());
		System.out.println(turno6.getPrecio());
		System.out.println(turno7.getPrecio());
		System.out.println(turno7);
		System.out.println(est.checkUsuarioEsSocio(pablo));
		

	}

}