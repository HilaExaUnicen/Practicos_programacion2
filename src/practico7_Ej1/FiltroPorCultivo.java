package practico7_Ej1;

public class FiltroPorCultivo extends Filtro {
	Cultivo cultivoAFiltrar;

	public FiltroPorCultivo(Cultivo cultivoAFiltrar) {
		this.cultivoAFiltrar = cultivoAFiltrar;
	}

	@Override
	public boolean cumpleCondicion(ProductoQuimico pq) { //Si el producto quimico es apropiado para el cultivo devuelve true
		if(!pq.cultivoEstaDesaconsejado(cultivoAFiltrar)) {// Si el cultivo NO esta desaconsejado
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	
}
