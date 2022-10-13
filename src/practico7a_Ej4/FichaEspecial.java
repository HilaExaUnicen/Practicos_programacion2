package practico7a_Ej4;

public class FichaEspecial extends Ficha {
	
	
	public FichaEspecial(int fortaleza, int poderDestruccion, int espacioQueOcupa) {
		super(fortaleza, poderDestruccion, espacioQueOcupa);
	}
	
	@Override
	public int getPoderDestruccion() {
		return (this.getFortaleza()/this.getEspacioQueOcupa());
	}
	
	
}
