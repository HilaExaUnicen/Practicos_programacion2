package practico7_Ej1;

import java.util.ArrayList;

public class Enfermedad {
	private String nombre;
	private ArrayList<String> estadosPatologicos;
	
	public Enfermedad(String nombre) {
		this.nombre = nombre;
		this.estadosPatologicos = new ArrayList<>();
	}
	
	public boolean enfermedadEsCuradaPor(ProductoQuimico pq) {
		for(int i = 0; i < estadosPatologicos.size(); i++) {
			if(!pq.curaEstadoPatologico(estadosPatologicos.get(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	
}
