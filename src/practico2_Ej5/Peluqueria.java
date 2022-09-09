package practico2_Ej5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class Peluqueria {
	private String nombre;
	private String direccion;
	private LocalTime horaApertura;
	private LocalTime horaCierre;
	ArrayList <Turno> turnos = new ArrayList();
	
	public Peluqueria(String nombre, String direccion, LocalTime horaApertura, LocalTime horaCierre) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
	}
	
	public void agregarTurno(Turno nuevoTurno) {
		LocalTime horaTurno = nuevoTurno.getHora();
		if(horaTurno.isAfter(horaApertura) && horaTurno.isBefore(horaCierre)) {
			turnos.add(nuevoTurno);
		}
	}
	
	public boolean getClienteFrecuente(Cliente c) {
		ArrayList <Turno> turnosUltimoMes = this.getTurnosUltimoMes();
		
		for(int i = 0; i < turnosUltimoMes.size(); i++) {
			if (turnosUltimoMes.get(i).getCliente() == c) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList <Turno> getTurnosUltimoMes(){
		ArrayList <Turno> turnosUltimoMes = new ArrayList();
		LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaHaceUnMes = fechaHoy.minusMonths(1);
		
		for(int i = 0; i < turnos.size();i++) {
			if(turnos.get(i).getDia().isAfter(fechaHaceUnMes)) {
				turnosUltimoMes.add(turnos.get(i));
			}
		}
		return turnosUltimoMes;
	}
	
	public static void main(String[] args) {
	
		
		Peluqueria peluqueriaCacho = new Peluqueria("Peluqueria Cacho", "San Martin 1400", LocalTime.of(9, 0), LocalTime.of(21, 0));
		
		Peluquero cacho = new Peluquero ("Cacho", LocalDate.of(1956, 8, 6));
		Peluquero aaron = new Peluquero ("Aaron", LocalDate.of(1978, 2, 6));
		Peluquero oscar = new Peluquero ("Oscar", LocalDate.of(1970, 1, 6));
		Peluquero changuito = new Peluquero ("Changuito", LocalDate.of(1991, 9, 30));
		
		Cliente juan = new Cliente("Juan");
		Cliente agustin = new Cliente("Agustin");
		
		Turno primerTurno = new Turno(LocalDate.of(2022, 8, 2), LocalTime.of(14, 0), juan, changuito, peluqueriaCacho, 500);
		peluqueriaCacho.agregarTurno(primerTurno);
		Turno segundoTurno = new Turno(LocalDate.now(), LocalTime.of(14, 0), juan, changuito, peluqueriaCacho, 500);
		peluqueriaCacho.agregarTurno(segundoTurno);
		
		System.out.println(peluqueriaCacho.getClienteFrecuente(juan));
		System.out.println(primerTurno.getPrecio());
		System.out.println(segundoTurno.getPrecio());
		
		
		
	}
	
	
}
