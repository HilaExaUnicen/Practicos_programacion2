package practico7a_Ej5;

public class FiltroPorActor extends Filtro {
	
	private String actorABuscar;
	
	
	
	public FiltroPorActor(String actorABuscar) {
		this.actorABuscar = actorABuscar;
	}

	@Override
	public boolean cumpleCondicion(Pelicula p) {
		return p.contieneActor(this.actorABuscar);
	}

}
