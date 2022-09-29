package practico6_Ej1;

public abstract class Item {
	private static int idItem;
	
	public Item() {
		this.idItem++;
	}
	
	public abstract boolean puedeAlquilarse();
}
