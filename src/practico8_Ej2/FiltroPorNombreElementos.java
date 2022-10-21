package practico8_Ej2;

public class FiltroPorNombreElementos extends Filtro {

	private String nombreABuscar;
	
	
	
	public FiltroPorNombreElementos(String nombreABuscar) {
		this.nombreABuscar = nombreABuscar;
	}


	@Override
	public boolean cumpleCondicion(ElementoSistemaArchivos elemento) {
		return elemento.getNombre().equals(nombreABuscar);
	}
	
}
