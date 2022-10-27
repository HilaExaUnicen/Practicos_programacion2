package practico8_Ej4;

import java.time.LocalTime;

public class FiltroVotosDespuesDeDeterminadoHorario extends Filtro {

	private LocalTime horarioBuscado;
	
	@Override
	public boolean cumpleCondicion(Voto voto) {
		return voto.getHoraVotoFueEfectuado().isAfter(horarioBuscado);
	}

}
