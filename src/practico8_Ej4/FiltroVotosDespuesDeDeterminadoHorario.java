package practico8_Ej4;

import java.time.LocalDate;

public class FiltroVotosDespuesDeDeterminadoHorario extends Filtro {

	private LocalDate horarioBuscado;
	
	@Override
	public boolean cumpleCondicion(Voto voto) {
		return voto.getHoraVotoFueEfectuado().isAfter(horarioBuscado);
	}

}
