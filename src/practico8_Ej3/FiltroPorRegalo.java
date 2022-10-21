package practico8_Ej3;

public class FiltroPorRegalo extends Filtro {
	private String regaloBuscado;

	public FiltroPorRegalo(String regaloBuscado) {
		this.regaloBuscado = regaloBuscado;
	}

	@Override
	public boolean cumpleCondicion(Carta carta) {
		return carta.contieneRegalo(regaloBuscado);
	}
	
	
}
