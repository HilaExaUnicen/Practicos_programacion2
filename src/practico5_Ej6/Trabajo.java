package practico5_Ej6;

import java.util.ArrayList;

public class Trabajo {
	private String nombreTrabajo;
	protected ArrayList<String> palabrasClave;
	
	public Trabajo(String nombreTrabajo) {
		this.nombreTrabajo = nombreTrabajo;
		palabrasClave = new ArrayList();
	}
	
	public boolean trabajoEsAptoParaEvaluador(Evaluador eval) {
		for(int i = 0; i < palabrasClave.size(); i++) { //el bucle va a evaluar si el evaluador contiene en su array los conocimientos necesarios para evaluar el trabajo
			if(!eval.evaluadorContieneConocimiento(palabrasClave.get(i))) { //si no lo contiene retorna false directamente
				return false;
			}
		}
		
		return true; //si salio de la iteracion, quiere decir que el evaluador contiene todos los conocimientos, entonces retorna true
	}
}
