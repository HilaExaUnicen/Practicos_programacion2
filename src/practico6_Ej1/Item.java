package practico6_Ej1;

public abstract class Item {
	private static int staticId = 1;
	private int idItem;
	
	public Item() {
		this.idItem = staticId;
		staticId++;
	}
	
	public int getIdItem() {
		return idItem;
	}
	
	public abstract boolean puedeAlquilarse();
	
	public abstract void ponerEnAlquiler();
	
	public abstract void itemDevuelto();
}
