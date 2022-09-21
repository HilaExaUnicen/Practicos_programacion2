package practico5_Ej6;

import java.util.ArrayList;

public class Congreso {
	private ArrayList <Evaluador> evaluadores;
	private static ArrayList <String> conocimientosNecesariosExperto;// Es estatico porque para todos los evaluadores se evaluan los mismos conocimientos.
	
	public Congreso() {
		evaluadores = new ArrayList();
		conocimientosNecesariosExperto = new ArrayList();
	}
	
	public boolean evaluadorEsExperto(Evaluador eval) {
		for(int i = 0; i < conocimientosNecesariosExperto.size(); i++) {
			if(!eval.evaluadorContieneConocimiento(conocimientosNecesariosExperto.get(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
}
