package practico4_Ej6;

import java.util.ArrayList;

public class Jerarquico extends PersonasAsociadas {
	private int nroLegajo, sueldo;
	private ArrayList<Empleado> empleadosACargo;
	public Jerarquico(String nombre, String apellido, int edad, int nroLegajo, int sueldo) {
		super(nombre, apellido, edad);
		this.nroLegajo = nroLegajo;
		this.sueldo = sueldo;
		empleadosACargo = new ArrayList();
	}
	

	
	
}
