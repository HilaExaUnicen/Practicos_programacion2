package practico5_Ej6;

import java.util.ArrayList;

public class Evaluador {
	private String nombre;
	private ArrayList<String> conocimientos;
	private ArrayList<Trabajo> trabajosACargo;
	
	public Evaluador(String nombre) {
		this.nombre = nombre;
		conocimientos = new ArrayList();
		trabajosACargo = new ArrayList();
	}
	
	public boolean evaluadorContieneConocimiento(String conocimiento) {
		return conocimientos.contains(conocimiento);
	}
	
	public boolean evaluadorEsAptoParaTrabajo(Trabajo t) {
		if(t.trabajoEsAptoParaEvaluador(this)) {// el objeto se pasa a si mismo como parametro con la palabra this
			return true;
		}
		
		return false;
	}
	
	public int getCantidadTrabajosACargo() {
		return trabajosACargo.size();
	}
	
}
