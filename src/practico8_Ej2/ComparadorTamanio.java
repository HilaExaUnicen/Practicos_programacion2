package practico8_Ej2;

import java.util.Comparator;

public class ComparadorTamanio implements Comparator<ElementoSistemaArchivos> {

	@Override
	public int compare(ElementoSistemaArchivos e1, ElementoSistemaArchivos e2) {
		return e1.getTamanio() - e2.getTamanio();
	} 

}
