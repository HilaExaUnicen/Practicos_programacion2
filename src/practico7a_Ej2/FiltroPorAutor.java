package practico7a_Ej2;

public class FiltroPorAutor extends Filtro {
	private String autorBuscado;
	
	public FiltroPorAutor(String autorBuscado) {
		this.autorBuscado = autorBuscado;
	}

	@Override
	public boolean cumpleCondicion(Documento doc) {
		return doc.contieneAutor(autorBuscado);
	}
}
