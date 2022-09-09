package practico2_Ej1;

public class MainSerie {

	public static void main(String[] args) {
		Serie betterCallCarlitos = new Serie("Better call carlitos", "la historia del boga tatobien carlitos",
											 "Vicente gilligan", "Drama", 6);
		
		Temporada season1 = new Temporada(betterCallCarlitos, 1);
		Temporada season2 = new Temporada(betterCallCarlitos, 2);
		betterCallCarlitos.insertTemporada(season1);
		betterCallCarlitos.insertTemporada(season2);
		
		
		Episodio piloto = new Episodio ("Piloto", "El comienzo de la historia", true, 5, 1);
		season1.insertEpisodio(piloto, piloto.getPerteneceATemporada());
		Episodio piloto2 = new Episodio ("Piloto", "El comienzo de la historia", false, 5, 1);
		season1.insertEpisodio(piloto2, piloto.getPerteneceATemporada());
		Episodio piloto3 = new Episodio ("Piloto", "El comienzo de la historia", true, 4, 1);
		season1.insertEpisodio(piloto3, piloto.getPerteneceATemporada());
		
		Episodio ep1Season2 = new Episodio("temp2", "Coming soon", false, 5, 2);
		season2.insertEpisodio(ep1Season2, ep1Season2.getPerteneceATemporada());
		Episodio ep2Season2 = new Episodio("temp2", "Coming soon", true, 5, 2);
		season2.insertEpisodio(ep2Season2, ep2Season2.getPerteneceATemporada());
		Episodio ep3Season2 = new Episodio("temp2", "Coming soon", true, 5, 2);
		season2.insertEpisodio(ep3Season2, ep3Season2.getPerteneceATemporada());
	
		
		
		
		System.out.println("La calificacion del primer capitulo de la serie es de " + piloto.getCalificacion());
		
		System.out.println("cant episodios vistos season1: " + season1.getEpisodiosVistos());
		System.out.println("cant episodios vistos season2: " + season2.getEpisodiosVistos());
		
		System.out.println("La cantidad total de episodios vistos en la serie es de " + betterCallCarlitos.getCantidadEpisodiosVistosTotalSerie());
		
		System.out.println("El promedio de puntaje de la temporada " + season1.getNroTemporada() + " es igual a " + season1.getPromedioCalificacionTemporada());
		System.out.println("El promedio de puntaje de la serie " + betterCallCarlitos.getTitulo() + " es " + betterCallCarlitos.getPromedioCalificacionSerie());
		
		System.out.println("Todos los episodios de la serie vistos: " + betterCallCarlitos.areTodosVistos());

	}

}
