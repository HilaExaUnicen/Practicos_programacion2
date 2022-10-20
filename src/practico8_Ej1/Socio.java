package practico8_Ej1;

import java.util.ArrayList;

public class Socio {
	private String nombre, apellido;
	private int edad;
	private boolean pagoUltimaCuota;
	private ArrayList<Alquiler> alquileresRealizados;
	
	public Socio(String nombre, String apellido, int edad, boolean pagoUltimaCuota) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.pagoUltimaCuota = pagoUltimaCuota;
		this.alquileresRealizados = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public boolean isPagoUltimaCuota() {
		return pagoUltimaCuota;
	}
	
	public boolean pagoMasDe(int monto) {
		
		for(int i = 0; i < alquileresRealizados.size(); i++) {
			Alquiler alquiler = alquileresRealizados.get(i);
			if(alquiler.getMontoAbonado() > monto) {
				return true;
			}
		}
		
		return false;
	}
	
	public int getCantAlquileresCanchaNro(int nroCancha) {
		int contadorCantAlquileres = 0;
		
		for(int i = 0; i < alquileresRealizados.size(); i++) {
			Alquiler alquiler = alquileresRealizados.get(i);
			if(alquiler.getIdCancha() == nroCancha) {
				contadorCantAlquileres++;
			}
		}
		
		return contadorCantAlquileres;
	}
	
	public boolean socioAlquiloCanchaNro(int nroCancha) {
		
		for(int i = 0; i < alquileresRealizados.size(); i++) {
			Alquiler alquiler = alquileresRealizados.get(i);
			if(alquiler.getIdCancha() == nroCancha) {
				return true;
			}
		}
		
		return false;
	}
	
	
}
