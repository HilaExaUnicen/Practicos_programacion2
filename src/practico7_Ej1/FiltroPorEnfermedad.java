package practico7_Ej1;

public class FiltroPorEnfermedad extends Filtro {
	Enfermedad enfermedadAFiltrar;

	public FiltroPorEnfermedad(Enfermedad enfermedadAFiltrar) {
		this.enfermedadAFiltrar = enfermedadAFiltrar;
	}

	@Override
	public boolean cumpleCondicion(ProductoQuimico pq) {
		return pq.trataEnfermedad(enfermedadAFiltrar);
	}
	
	
	
	
}
