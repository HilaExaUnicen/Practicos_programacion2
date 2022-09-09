package practico2_Ej2;

import java.util.ArrayList;

public class Reunion {
	
	private String lugar;
	private Participante [] participantes;
	private String tema;
	private float duracion;
	
	public Reunion (String lugar, Participante [] participantes, String tema, float duracion) {
		this.lugar = lugar;
		this.participantes = participantes;
		this.tema = tema;
		this.duracion = duracion;
	}

	public Participante[] getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Participante[] participantes) {
		this.participantes = participantes;
	}

	
	
	
	
}
