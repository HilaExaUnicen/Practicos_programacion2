package practico7a_Ej5;

import java.util.ArrayList;

public class PlataformaStreaming {
	private ArrayList<Pelicula> catalogo;
	private Filtro politicaPeliculaEsRentable;
	
	public PlataformaStreaming (Filtro politicaPeliculaEsRentable) {
		catalogo = new ArrayList<>();	
		this.politicaPeliculaEsRentable = politicaPeliculaEsRentable;
	}
	
	public void addPelicula(Pelicula p) {
		if(!catalogo.contains(p)) { 
			catalogo.add(p);
		}
	}
	
	public ArrayList<Pelicula> buscarPor(Filtro filtro){
		ArrayList <Pelicula> resultado = new ArrayList<>();
		
		for(int i = 0; i < catalogo.size(); i++) {
			if(filtro.cumpleCondicion(catalogo.get(i))) {
				resultado.add(catalogo.get(i));
			}
		}
		return resultado;
	}
	
	public boolean peliculaEsRentable(Pelicula p) {
		if(this.politicaPeliculaEsRentable.cumpleCondicion(p)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setPoliticaPeliculaEsRentable(Filtro f) {
		this.politicaPeliculaEsRentable = f;
	}
}
