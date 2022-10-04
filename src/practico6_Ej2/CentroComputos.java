package practico6_Ej2;

public class CentroComputos {
	ColaElementos computadoras;
	ColaElementos procesos;
	
	public CentroComputos() {
		computadoras = new ColaElementos();
		procesos = new ColaElementos();
	}
	
	public void addComputadora(Computadora c) {
		computadoras.addElemento(c);
	}
	
	public void addProceso(Proceso p) {
		procesos.addElemento(p);
	}
	
	public void imprimirComputadoras() {
		System.out.println(this.computadoras);
	}
	
	public void imprimirProcesos() {
		System.out.println(this.procesos);
	}
	
	
	
	public static void main(String[] args) {
		CentroComputos centro = new CentroComputos();
		
		Computadora comp1 = new Computadora(2000);
		Computadora comp2 = new Computadora(4000);
		Computadora comp3 = new Computadora(5000);
		Computadora comp4 = new Computadora(8000);
		
		centro.addComputadora(comp1);
		centro.addComputadora(comp2);
		centro.addComputadora(comp3);
		centro.addComputadora(comp4);
		
		Proceso proc1 = new Proceso(1000);
		Proceso proc2 = new Proceso(2000);
		Proceso proc3 = new Proceso(1500);
		Proceso proc4 = new Proceso(3000);
		
		centro.addProceso(proc1);
		centro.addProceso(proc2);
		centro.addProceso(proc3);
		centro.addProceso(proc4);
		
		centro.imprimirComputadoras();
		centro.imprimirProcesos();
		
		
	}
}
