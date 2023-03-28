package practico5_Ej1;

public final class PilaList {
	Object [] pilaList;
	public static int indice = 0;
	
	public PilaList(int tamanio) {
		pilaList = new Object [tamanio];
	}
	
	public PilaList() {
		pilaList = new Object [10];
	}
	
	public void push(Object o) {
		if(indice < pilaList.length) {
			pilaList[indice] = o;
			indice++;
		}
		else {
			System.out.println("Stack overflow!");
		}
	}
	
	public void pop() {
		if (indice > 0) {
			indice--;
			pilaList[indice] = null;
		}
	}
	
	public Object top() {
		return pilaList[indice];
	}
	
	public int size() {
		int contadorTamanio = 0;
		for(int i = 0; i < pilaList.length;i++) {
			if(pilaList[i] != null) {
				contadorTamanio++;
			}
		}
		return contadorTamanio;
	}
	
	public Object[] reverse() {
		int indiceAux = 0;
		Object [] copiaReversa = new Object [pilaList.length];
		for (int i = (copiaReversa.length-1);i >= 0; i--) {
			if(pilaList[indiceAux] != null && indiceAux < pilaList.length) {
				copiaReversa[i] = pilaList[indiceAux];
				indiceAux++;
			}
		}
		
		return copiaReversa;
	}
	
	public Object[] copy() {
		Object [] copia = new Object [pilaList.length];
		copia = pilaList;
		
		return copia;
	}
	
	public void print() {
		for(int i = 0; i < pilaList.length; i++) {
			System.out.println(pilaList[i]);
		}
	}
	
	public static void main(String[] args) {
		PilaList nuevaPila = new PilaList(3);
//		Object obj1 = new Object();
//		Object obj2 = new Object();
//		Object obj3 = new Object();
		nuevaPila.push(1);
		nuevaPila.push(2);
		nuevaPila.push(3);
		
		nuevaPila.print();
		System.out.println("---------");
		System.out.println("Arreglo reversa");
		Object[] copiaPilaReversa = nuevaPila.reverse();
		for(int i = 0; i < copiaPilaReversa.length;i++) {
			System.out.println(copiaPilaReversa[i]);
		}

		
		
		nuevaPila.pop();
		System.out.println("------");
		System.out.println("Se realiza un pop");
		nuevaPila.print();
		System.out.println("------");
		System.out.println("Cant objetos dentro del arreglo "+ nuevaPila.size());
		
	}

	
	
	
	
	
	
}
