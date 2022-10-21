package practico8_Ej2;

import java.time.LocalDate;

public class FiltroFechaModificacionDespuesDe extends Filtro {
	private LocalDate fechaABuscar;

	public FiltroFechaModificacionDespuesDe(LocalDate fechaABuscar) {
		this.fechaABuscar = fechaABuscar;
	}

	@Override
	public boolean cumpleCondicion(ElementoSistemaArchivos elemento) {
		return elemento.getFechaUltimaModificacion().isAfter(fechaABuscar);
	}
	
	
}
