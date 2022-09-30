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
	
	public void addAlquiler(Alquiler alquiler) {
		Item item = alquiler.getItem();
		
		if(item.puedeAlquilarse() == true) {
			item.ponerEnAlquiler();
			alquileres.add(alquiler);
		}
		else {
			System.out.println("No hay mas copias del item o ya esta alquilado");
		}
	}
//	
	public ArrayList<Cliente> getClientesAlquilerVencido(){  //Este metodo retorna un array con los clientes que tienen un item hace mas dias de lo que pactaron y no lo devolvieron
		ArrayList<Cliente> resultado = new ArrayList<>();

		for(int i = 0; i < alquileres.size(); i++) {			
			if(alquileres.get(i).alquilerEstaVencido()) { 				
				resultado.add(alquileres.get(i).getCliente()); //Se agrega el cliente al arreglo a devolver en el metodo
			}
		}
		
		return resultado;
	}
	
	
	
}
