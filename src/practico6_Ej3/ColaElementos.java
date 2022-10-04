package practico6_Ej3;

import java.util.ArrayList;

public class ColaElementos {
	
	private ArrayList<ElementoOrdenable> elementos;
	
	public ColaElementos() {
		elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoOrdenable nuevoElemento) {
		int index = 0;
		boolean insertado = false;
		
		while(insertado == false && index < elementos.size()) {
			ElementoOrdenable aux = elementos.get(index);
			
			if(nuevoElemento.esMayor(aux)) {
				insertado = true;
				elementos.add(index, nuevoElemento);
			}
			index++;
		}
		
		if(!insertado) { // Si no lo inserto en ningun lado que lo agregue al final
			elementos.add(nuevoElemento);
		}
	}
	
	public ElementoOrdenable siguiente() {
		ElementoOrdenable siguiente = elementos.get(0);
		elementos.remove(0);
		return siguiente;
	}
	
    public String toString(){
        return elementos.toString();
    }
}
