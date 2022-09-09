package practico3_Ej2;

import java.util.ArrayList;

public class FabricaMuebles {
	private String nombre;
	private String ciudad;
	private ArrayList<Mueble> muebles;
	
	public FabricaMuebles(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		muebles = new ArrayList<>();
	}
	
	public void agregarMueble(Mueble m) {
		muebles.add(m);
	}
	
	public ArrayList<Mueble> getPrecioProductosEnStock(){
		ArrayList<Mueble> mueblesEnStock = new ArrayList();
		
		for(int i = 0; i < muebles.size(); i++) {
			if(muebles.get(i).isEnStock() == true) {
				mueblesEnStock.add(muebles.get(i));
			}
		}
		
		return mueblesEnStock;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	
	public static void main(String[] args) {
		FabricaMuebles f1 = new FabricaMuebles("Fabrica de muebles", "Tandil");
		
		Silla silla1 = new Silla("Silla Abedul", 5, 3000, "Abedul", "Amarillo", true);
		Mesa mesa1 = new Mesa("Mesa de roble", 100, 10000, "Roble", "Marron", true);
		Banco banco1 = new Banco("Banco comun", 70, 6000, "Pino", "Marron", true);
		
		f1.agregarMueble(mesa1);
		f1.agregarMueble(silla1);
		f1.agregarMueble(banco1);
		
		ArrayList<Mueble> mueblesEnStock = f1.getPrecioProductosEnStock();
		
		for(int i = 0; i < mueblesEnStock.size();i++) {
			System.out.println(mueblesEnStock.get(i).getNombre() + "-- Costo fabricacion: " + mueblesEnStock.get(i).getCostoFabricacion()
								+ " -- Precio venta: " + (mueblesEnStock.get(i).getValorDeVenta()));
		}
	}
}
