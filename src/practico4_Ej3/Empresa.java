package practico4_Ej3;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Empleado> empleados;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		empleados = new ArrayList<>();
	}
	
	public void addEmpleado(Empleado e) {
		empleados.add(e);
	}
	
	public void getListaSueldoEmpleados(){
		for(int i = 0; i < empleados.size(); i++) {
			System.out.println("Empleado: " + empleados.get(i).getNombre() + " " + empleados.get(i).getApellido() + " Sueldo: " + empleados.get(i).getSueldo());
		}
	}
	
	
	public static void main(String[] args) {
		Empresa empresa = new Empresa("La empresa");
		
		EmpleadoContratado emp1 = new EmpleadoContratado("Agustin", "Rossi", 200000);
		EmpleadoContratado emp2 = new EmpleadoContratado("Changuito", "Zeballos", 35000);
		EmpleadoHorasExtra emp3 = new EmpleadoHorasExtra("Dario", "Benedetto", 500000, 5);
		EmpleadoHorasExtra emp4 = new EmpleadoHorasExtra("Frank", "Fabra", 700000, 8);
		EmpleadoComision emp5 = new EmpleadoComision("Nicolas", "Figal", 450000, 25);
		EmpleadoComision emp6 = new EmpleadoComision("Alan", "Varela", 200000, 30);
		
		empresa.addEmpleado(emp1);
		empresa.addEmpleado(emp2);
		empresa.addEmpleado(emp3);
		empresa.addEmpleado(emp4);
		empresa.addEmpleado(emp5);
		empresa.addEmpleado(emp6);
		
		empresa.getListaSueldoEmpleados();
		
		
	}
}
