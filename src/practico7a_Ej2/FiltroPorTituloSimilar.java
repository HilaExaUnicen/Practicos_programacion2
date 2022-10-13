package practico7a_Ej2;

public class FiltroPorTituloSimilar extends Filtro {

	private String palabraClaveABuscarEnTitulo;
	
	public FiltroPorTituloSimilar(String palabraClaveABuscarEnTitulo) {
		this.palabraClaveABuscarEnTitulo = palabraClaveABuscarEnTitulo;
	}

	@Override
	public boolean cumpleCondicion(Documento doc) {
		return doc.getTitulo().contains(palabraClaveABuscarEnTitulo);
	}
}
