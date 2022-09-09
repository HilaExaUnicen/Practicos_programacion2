package practico2_Ej3;

import java.util.ArrayList;

public class Ciudad {
	private String nombre;
	private String provincia;
	private int habitantes;
	private ArrayList<Impuesto> impuestos = new ArrayList();
	private float montoGastado;
	
	
	public Ciudad(Provincia provincia, String nombre, int habitantes, float montoGastado) {
		this.nombre = nombre;
		this.provincia = provincia.getNombre();
		this.habitantes = habitantes;
		this.montoGastado = montoGastado;
	}
	
	public void insertarImpuesto(Impuesto imp) {
		if(this.habitantes >= 100000) {
			impuestos.add(imp);
		}
	}
	
	public boolean esDeficitaria() {
		float recaudacionTotal = 0;
		float diferencia = 0;
		if(this.habitantes >= 100000) {
			for(int i = 0; i < impuestos.size();i++) {
				recaudacionTotal += impuestos.get(i).getMonto();
			}
			
			diferencia = (recaudacionTotal - this.montoGastado);
		}
		
		if(diferencia >= 0) { //Si gasto menos o lo mismo que la recaudacion total no tiene deficit.
			return false;
		}
		else {
			return true;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public int getHabitantes() {
		return habitantes;
	}
}