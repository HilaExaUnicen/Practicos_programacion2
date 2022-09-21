package practico5_Ej6;

public class Poster extends Trabajo {

	public Poster(String nombreTrabajo) {
		super(nombreTrabajo);
	}
	
	@Override 
	public boolean trabajoEsAptoParaEvaluador(Evaluador eval) {
		for(int i = 0; i < this.palabrasClave.size(); i++) {
			if(eval.evaluadorContieneConocimiento(palabrasClave.get(i))) {
				return true;
			}
		}
		
		return false;
	}
	
	
}
