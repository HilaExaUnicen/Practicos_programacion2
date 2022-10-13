package practico7_Ej1;

import java.util.ArrayList;

public class ProductoQuimico {
	private String nombre;
	private ArrayList<Cultivo> cultivosDesaconsejados;
	private ArrayList<String> estadosPatologicosQueTrata;
	
	public ProductoQuimico(String nombre) {
		this.nombre = nombre;
		this.cultivosDesaconsejados = new ArrayList<>();
		this.estadosPatologicosQueTrata = new ArrayList<>();
	}
	
	public boolean trataEnfermedad(Enfermedad e) {
		if(e.enfermedadEsCuradaPor(this)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean cultivoEstaDesaconsejado(Cultivo cult) {
		return cultivosDesaconsejados.contains(cult);
	}
		
	public boolean curaEstadoPatologico(String estPatologico) {
		if(estadosPatologicosQueTrata.contains(estPatologico)) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public String getNombre() {
		return nombre;
	}
	
}
