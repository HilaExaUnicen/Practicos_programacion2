package practico8_Ej2;

import java.util.Comparator;

public class ComparadorAnd implements Comparator<ElementoSistemaArchivos> {
	
	private Comparator<ElementoSistemaArchivos> c1, c2;
	
	public ComparadorAnd(Comparator<ElementoSistemaArchivos> c1, Comparator<ElementoSistemaArchivos> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public int compare(ElementoSistemaArchivos e1, ElementoSistemaArchivos e2) {
		int resultado = c1.compare(e1, e2);
		if(resultado == 0) {
			resultado = c2.compare(e1, e2);
		}
		
		return resultado;
	} 

}
