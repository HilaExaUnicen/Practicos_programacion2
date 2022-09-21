package practico5_Ej5;

import java.util.ArrayList;

public class Empleado {
	private String nombre, apellido;
	private int dni;
	private double sueldo;
	protected ArrayList<Venta> ventas;
	
	
	public Empleado(String nombre, String apellido, int dni, double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldo = sueldo;
		ventas = new ArrayList();
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	public int getCantVentas() {
		return ventas.size();
	}
	
	public void addVenta(Venta v) {
		ventas.add(v);
	}
	
	
}
