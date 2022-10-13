package practico7a_Ej2;

public class FiltroPorPalabraClave extends Filtro {
	
	private String palabraClaveABuscar;
	
	public FiltroPorPalabraClave(String palabraClaveABuscar) {
		this.palabraClaveABuscar = palabraClaveABuscar;
	}

	@Override
	public boolean cumpleCondicion(Documento doc) {
		return doc.contienePalabraClave(this.palabraClaveABuscar);
	}
	
}
