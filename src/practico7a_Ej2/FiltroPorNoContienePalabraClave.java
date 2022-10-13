package practico7a_Ej2;

public class FiltroPorNoContienePalabraClave extends Filtro {
private String palabraClaveABuscar;
	
	public FiltroPorNoContienePalabraClave(String palabraClaveABuscar) {
		this.palabraClaveABuscar = palabraClaveABuscar;
	}

	@Override
	public boolean cumpleCondicion(Documento doc) {
		return !doc.contienePalabraClave(this.palabraClaveABuscar);// Si no contiene la palabra clave retorna true;
	}
}
