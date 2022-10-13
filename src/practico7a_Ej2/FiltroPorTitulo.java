package practico7a_Ej2;

public class FiltroPorTitulo extends Filtro {

	private String tituloABuscar;
	
	public FiltroPorTitulo(String tituloABuscar) {
		this.tituloABuscar = tituloABuscar;
	}

	@Override
	public boolean cumpleCondicion(Documento doc) {
		return this.tituloABuscar.equals(doc.getTitulo());
	}
	
}
