package practico8_Ej1;

public class FiltroPorNroCanchaAlquilada extends Filtro {

	private int nroCancha;
	
	public FiltroPorNroCanchaAlquilada(int nroCancha) {
		this.nroCancha = nroCancha;
	}
	
	@Override
	public boolean cumpleCondicion(Socio s) {
		return s.socioAlquiloCanchaNro(nroCancha);
	}

}
