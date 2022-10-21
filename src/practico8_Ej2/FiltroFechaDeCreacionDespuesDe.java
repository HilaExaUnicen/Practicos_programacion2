package practico8_Ej2;

import java.time.LocalDate;

public class FiltroFechaDeCreacionDespuesDe extends Filtro {
	private LocalDate fechaABuscar;

	public FiltroFechaDeCreacionDespuesDe(LocalDate fechaABuscar) {
		this.fechaABuscar = fechaABuscar;
	}

	@Override
	public boolean cumpleCondicion(ElementoSistemaArchivos elemento) {
		return elemento.getFechaCreacion().isAfter(fechaABuscar);
	}
	
	
}
