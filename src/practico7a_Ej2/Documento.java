package practico7a_Ej2;

import java.util.ArrayList;

public class Documento {
	private String titulo, contenidoTextual;
	private ArrayList<String> autores;
	private ArrayList<String> palabrasClave;
	
	
	public Documento(String titulo, String contenidoTextual) {
		this.titulo = titulo;
		this.contenidoTextual = contenidoTextual;
		this.autores = new ArrayList<>();
		this.palabrasClave = new ArrayList<>();
	}


	public String getTitulo() {
		return titulo;
	}

	public Documento(String contenidoTextual) {
		this.contenidoTextual = contenidoTextual;
	}
	
	public boolean contienePalabraClave(String palabraClave) {
		if(palabrasClave.contains(palabraClave)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getCantPalabrasClave() {
		return palabrasClave.size();
	}
	
	public boolean contieneAutor(String autor) {
		if(autores.contains(autor)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public boolean equals(Object o) {
		try {
			Documento otro = (Documento) o;
			if(this.getTitulo().equals(otro.getTitulo())) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e){
			System.out.println(e);
			return false;
		}

		
	}
	
	
	
	
	
	
}
