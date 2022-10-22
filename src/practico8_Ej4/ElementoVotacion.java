package practico8_Ej4;

public abstract class ElementoVotacion {
	
	public abstract int getCantVotosPor(Filtro f);
	public abstract int getCantTotalVotos();
	
	public double getPorcentajeVotosPor(Filtro f) {
		int cantVotosPorCondicion = this.getCantVotosPor(f);
		int cantTotalVotos = this.getCantTotalVotos();
		
		return ((cantVotosPorCondicion / cantTotalVotos) * 100);
	}
}
