package practico5_Ej5;

import java.util.ArrayList;

public class Empresa {
	ArrayList <Empleado> empleados;
	
	public Empresa() {
		empleados = new ArrayList();
	}
	
	public void addEmpleado(Empleado e) {
		empleados.add(e);
	}
	
	public double getSumaTotalGastosEnSueldos() {
		double sumatoriaTotalSueldosEmpleados = 0;
		for(int i = 0; i < empleados.size(); i++) {
			sumatoriaTotalSueldosEmpleados += empleados.get(i).getSueldo();
		}
		
		return sumatoriaTotalSueldosEmpleados;
	}
	
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		
		Empleado e1 = new Empleado("Pepe", "Hernandez", 5556669, 250000);
		Empleado e2 = new Empleado("Pepe", "Hernandez", 5556799, 210000);
		
		EmpleadoVendedor e3 = new EmpleadoVendedor("Pepe", "Hernandez", 55788969, 100000, 0.1);
		EmpleadoVendedor e4 = new EmpleadoVendedor("Pepe", "Hernandez", 55788969, 110000, 0.1);

		EmpleadoBono e5 = new EmpleadoBono("Pepe", "Hernandez", 55223969, 150000, 1000, 2);
		
		empresa.addEmpleado(e1);
		empresa.addEmpleado(e2);
		empresa.addEmpleado(e3);
		empresa.addEmpleado(e4);
		empresa.addEmpleado(e5);
		
		Venta v1 = new Venta("Microondas", 50000);
		Venta v2 = new Venta("Heladera", 100000);
		Venta v3 = new Venta("Monitor", 50000);
		
		e5.addVenta(v1);
		e5.addVenta(v2);
		
		e3.addVenta(v1);
		e3.addVenta(v2);
		
		System.out.println(e3.getSueldo());
		System.out.println(e5.getSueldo());
		
		System.out.println("La sumatoria total de sueldos de la empresa es de " + empresa.getSumaTotalGastosEnSueldos());
		
	}
}
