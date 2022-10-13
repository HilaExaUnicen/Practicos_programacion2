package practico7a_Ej2;

import java.util.ArrayList;

public class ColeccionDocumentos {
	private ArrayList<Documento> documentos;

	public ColeccionDocumentos() {
		this.documentos = new ArrayList<>();
	}
	
	public void addDocumento(Documento doc) {//Se comprueba que no exista otro documento igual, redefiniendo el equals de Documento
		if(!documentos.contains(doc)) {
			documentos.add(doc);
		}
	}
	
	public ArrayList<Documento> buscarDocsPor(Filtro filtro){
		ArrayList <Documento> resultado = new ArrayList<>();
		
		for(int i = 0; i < documentos.size(); i++) {
			Documento doc = documentos.get(i);
			if(filtro.cumpleCondicion(doc)) {
				resultado.add(doc);
			}
		}
		
		return resultado;
	}
	
	
}
