package practico6_Ej1;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainVideoClub {
	public static void main(String[] args) {
		VideoClub videoClub = new VideoClub();
		
		Pelicula pel1 = new Pelicula("pel 1", 20);
		Pelicula pel2 = new Pelicula("pel 2", 5);
		Pelicula pel3 = new Pelicula("pel 3", 3);
		Pelicula pel4 = new Pelicula("pel 4", 20);
		
		Vehiculo auto1 = new Vehiculo("Toyota", "Electrico", "1", 10000);
		Vehiculo auto2 = new Vehiculo("Toyota", "Diesel", "1", 90000);
		Vehiculo auto3 = new Vehiculo("Peugeot", "Naftero", "1", 19000);
		Vehiculo auto4 = new Vehiculo("Chevrolet", "Electrico", "1", 2000);
		
		Cliente cliente1 = new Cliente("Juan", 1);
		Cliente cliente2 = new Cliente("Kevinho", 2);
		Cliente cliente3 = new Cliente("Changuito", 3);
		
		Alquiler alq1 = new Alquiler(cliente3, pel2, LocalDate.of(2022, 10, 8));
		Alquiler alq2 = new Alquiler(cliente1, auto1, LocalDate.of(2022, 10, 8));
		Alquiler alq3 = new Alquiler(cliente2, auto2, LocalDate.of(2022, 10, 8));
		Alquiler alq4 = new Alquiler(cliente3, pel2, LocalDate.of(2022, 8, 8)); //Configuramos este alquiler como vencido
		
		videoClub.addAlquiler(alq1);
		videoClub.addAlquiler(alq2);
		videoClub.addAlquiler(alq3);
		videoClub.addAlquiler(alq4);
		
		System.out.println(pel2.getCantCopias());
		alq1.clienteDevuelveItem();
		System.out.println(pel2.getCantCopias());	
		
		//alq2.clienteDevuelveItem(); --> si no lo devolvemos, el siguiente alquiler no procedera
		
		Alquiler alq5 = new Alquiler(cliente3, auto1, LocalDate.of(2022, 10, 8));
		videoClub.addAlquiler(alq5);
		
		ArrayList<Cliente> clientesDeudores = videoClub.getClientesAlquilerVencido(); //Solo el alquiler 4 esta vencido
		
		for(int i = 0; i < clientesDeudores.size(); i++) {
			System.out.println(clientesDeudores.get(i));
		}
		
		
		
		
		

	}

	

	
}
