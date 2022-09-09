package practico2_Ej2;

import java.util.ArrayList;

public class AgendaPersonal {
	public static void main(String[] args) {
		Participante [] arrParticipantes = new Participante [2];
		
		Participante part1 = new Participante ("Juancito", 2323445, "tuvieja@gmail.com");
		Participante part2 = new Participante ("Gabriel", 2321475, "tuseniora@gmail.com");
		
		arrParticipantes[0] = part1;
		arrParticipantes[1] = part2;
		
		Reunion nuevaReunion = new Reunion("Loberia", arrParticipantes, "Becas", 2);  //ESTA INCOMPLETO
		
		Participante [] arr = nuevaReunion.getParticipantes();
		
		for(int i = 0; i < arr.length; i++) {
			Participante participante = arr[i];
			
			System.out.println(participante.getNombre());
		}
		
		 
	}
}
