package practico8_Ej4;

public abstract class ElementoVotacion {
	
	public abstract int getCantVotosPor(Filtro f);
	public abstract int getCantTotalVotos();
	
	public double getPorcentajeVotosPor(Filtro f) {
		double cantVotosPorCondicion = this.getCantVotosPor(f);
		double cantTotalVotos = this.getCantTotalVotos();
		double resultado = (cantVotosPorCondicion/cantTotalVotos) * 100;
		return resultado;
	}
}
