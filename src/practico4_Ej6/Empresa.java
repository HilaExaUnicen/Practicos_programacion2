package practico4_Ej6;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList <PersonasAsociadas> personas;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		personas = new ArrayList();
	}
	
	public void addPersona(PersonasAsociadas pa) {
		personas.add(pa);
	}
	
	public static void main(String[] args) {
		Empresa em = new Empresa("Empresssa");
		
		Empleado emp1 = new Empleado("Juan", "Zeballos", 26, 2888, 100000);
		
		System.out.println(emp1);
	}
}
