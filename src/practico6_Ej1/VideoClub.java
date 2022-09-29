package practico6_Ej1;
//El videoclub alquila peliculas y vehiculos para diversificar sus ventas

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class VideoClub {
	private ArrayList <Item> items;
	private ArrayList <Alquiler> alquileres;
	
	public VideoClub() {
		items = new ArrayList<>();
		alquileres = new ArrayList<>();
	}
	
	public void addItem(Item i) {
		items.add(i);
	}
	
	public void addAlquiler(Alquiler alq) {
		if(alq.getItem().puedeAlquilarse() == true) {
			alquileres.add(alq);
		}
		else {
			System.out.println("No hay mas copias del item o ya esta alquilado");
		}
	}
	
	public ArrayList<Cliente> getClientesAlquilerVencido(){  //Este metodo retorna un array con los clientes que tienen un item hace mas dias de lo que pactaron
		ArrayList<Cliente> resultado = new ArrayList<>();
		LocalDate hoy = LocalDate.now();
		
		for(int i = 0; i < alquileres.size(); i++) {
			Period periodoDiasLlevaAlquilado = Period.between(alquileres.get(i).getFechaAlquiler(), hoy);
			int diasLlevaAlquilado = periodoDiasLlevaAlquilado.getDays(); //---------------->Se obtiene el periodo de dias desde que el cliente alquilo un item hasta hoy
			
			if(diasLlevaAlquilado > alquileres.get(i).getCantDiasEnAlquiler() && alquileres.get(i).isDevuelto() == false) { //Si la cantidad de dias que el cliente tiene el item supera el establecido y no lo devolvio
				resultado.add(alquileres.get(i).getCliente()); 																//se agrega el cliente al arreglo a devolver en el metodo
			}
		}
		
		return resultado;
	}
	
	
	
}
