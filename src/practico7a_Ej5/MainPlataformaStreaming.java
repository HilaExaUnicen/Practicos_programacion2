package practico7a_Ej5;

public class MainPlataformaStreaming {
	public static void main(String[] args) {
		
		Pelicula p1 = new Pelicula("pel1", "laPeli1", "Carlitos", 2010, 12 ,100);
		Pelicula p2 = new Pelicula("pel2", "laPeli2", "Carlitos", 2014, 16 ,90);
		Pelicula p3 = new Pelicula("pel3", "laPeli3", "Carlitos", 2015, 18 ,132);
		Pelicula p4 = new Pelicula("pel4", "laPeli4", "Carlitos", 2018, 3 ,110);
		Pelicula p5 = new Pelicula("pel5", "laPeli5", "Carlitos", 2012, 6 ,132);
		
		p1.addGenero("comedia");
		
		//En este ejercicio se puede ver como se pueden meter filtros dentro de filtros y asi.
		
		//Politicas de pelicula rentable: 
			//*Peliculas cuya duracion sea menor a 120 minutos, que no sean del genero "comedia" y
			//*Peliculas posteriores del 2017, a no ser que se trate de peliculas del genero "infantil" o "documental".
		
		
		Filtro f1 = new FiltroDuracionMenorA(120);
		Filtro f2 = new FiltroNot(new FiltroPorGenero("comedia"));
		
		Filtro filtroAndCondicion1 = new FiltroAnd(f1,f2); 
		
		Filtro f3 = new FiltroPeliculasPosterioresAAnio(2017);
		Filtro f4 = new FiltroAnd(new FiltroPorGenero("infantil"), new FiltroPorGenero("documental")); //Los inicializo y a la vez los paso como parametros
		
		Filtro filtroOrCondicion2 = new FiltroOr(f3,f4);
		
		Filtro filtroPoliticaPeliculaRentable = new FiltroOr(filtroAndCondicion1,filtroOrCondicion2);
		
		PlataformaStreaming netfli = new PlataformaStreaming(filtroPoliticaPeliculaRentable);
		netfli.addPelicula(p1);
		netfli.addPelicula(p2);
		netfli.addPelicula(p3);
		netfli.addPelicula(p4);
		netfli.addPelicula(p5);
		
		System.out.println(netfli.peliculaEsRentable(p4));
		
		
		//PRUEBA DE FILTROS:
		System.out.println(netfli.buscarPor(filtroAndCondicion1));
	}
}
