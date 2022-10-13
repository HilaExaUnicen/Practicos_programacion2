package practico7a_Ej4;

public class FiltroPorFortalezaMayorA extends Filtro{
	private int fortalezaMayorA;
	
	public  FiltroPorFortalezaMayorA(int fortalezaMayorA) {
		this.fortalezaMayorA = fortalezaMayorA;
	}
	
	@Override
	public boolean cumpleCondicion(Ficha f) {
		return f.getFortaleza() > this.fortalezaMayorA;
	}
}
