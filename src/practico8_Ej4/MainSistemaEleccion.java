package practico8_Ej4;

import java.time.LocalTime;

public class MainSistemaEleccion {
	
	public static void main(String[] args) {
		SistemaEleccion elec = new SistemaEleccion();
		
		Candidato cand1 = new Candidato ("Juan", "Azul", "Boke");
		Candidato cand2 = new Candidato ("Agustin", "Amarillo", "Boke");
		Candidato cand3 = new Candidato ("Exequiel", "Amarillo", "Boke");
		Candidato cand4 = new Candidato ("Dario", "Azul", "Boke");
		Candidato cand5 = new Candidato ("Frank", "Azul", "Boke");
		Candidato cand6 = new Candidato ("Armanco", "Rojo", "Riber");
		Candidato cand7 = new Candidato ("Daniel", "Blanco", "Riber");
		Candidato cand8 = new Candidato ("John", "Rojo", "Riber");
		
		elec.addCandidato(cand1);
		elec.addCandidato(cand2);
		elec.addCandidato(cand3);
		elec.addCandidato(cand4);
		elec.addCandidato(cand5);
		elec.addCandidato(cand6);
		elec.addCandidato(cand7);
		elec.addCandidato(cand8);
		
		
		
		ElementoCompuestoVotacion tandil = new ElementoCompuestoVotacion();
		
		//barrio4.addEstablecimiento(est1);
		//barrio4.addEstablecimiento(est1);
		
		ElementoCompuestoVotacion mesa1 = new ElementoCompuestoVotacion();
		ElementoCompuestoVotacion mesa2 = new ElementoCompuestoVotacion();
		ElementoCompuestoVotacion mesa3 = new ElementoCompuestoVotacion();
		ElementoCompuestoVotacion mesa4 = new ElementoCompuestoVotacion();
		ElementoCompuestoVotacion mesa5 = new ElementoCompuestoVotacion();
		ElementoCompuestoVotacion mesa6 = new ElementoCompuestoVotacion();
		
		tandil.addVoto(mesa1);
		tandil.addVoto(mesa2);
		tandil.addVoto(mesa3);
		tandil.addVoto(mesa4);
		tandil.addVoto(mesa5);
		tandil.addVoto(mesa6);

			
		mesa1.addVotanteAMesa(1);
		mesa1.addVotanteAMesa(2);
		
		mesa2.addVotanteAMesa(3);
		mesa2.addVotanteAMesa(4);
	
		mesa3.addVotanteAMesa(5);
		mesa3.addVotanteAMesa(6);

		mesa4.addVotanteAMesa(7);
		mesa4.addVotanteAMesa(8);
		
		mesa5.addVotanteAMesa(9);
		mesa5.addVotanteAMesa(10);
		
		mesa6.addVotanteAMesa(11);
		mesa6.addVotanteAMesa(12);
		mesa6.addVotanteAMesa(13);
		
		Voto voto1 = new Voto(cand1, LocalTime.of(10, 0), 1);
		Voto voto2 = new Voto(cand2, LocalTime.of(12, 0), 2);
		Voto voto3 = new Voto(cand3, LocalTime.of(15, 0), 3);
		Voto voto4 = new Voto(cand1, LocalTime.of(17, 0), 4);
		Voto voto5 = new Voto(null, LocalTime.of(13, 0), 5);
		Voto voto6 = new Voto(cand3, LocalTime.of(14, 0), 6);
		Voto voto7 = new Voto(cand5, LocalTime.of(12, 0), 7);
		Voto voto8 = new Voto(cand2, LocalTime.of(10, 0), 8);
		Voto voto9 = new Voto(cand5, LocalTime.of(10, 0), 9);
		Voto voto10 = new Voto(cand3, LocalTime.of(10, 0), 10);
		Voto voto11 = new Voto(cand3, LocalTime.of(10, 0), 11);
		Voto voto12 = new Voto(cand1, LocalTime.of(10, 0), 12);
		Voto voto13 = new Voto(cand1, LocalTime.of(10, 0), 13);
		
		mesa1.addVoto(voto1);
		mesa1.addVoto(voto2);
		
		mesa2.addVoto(voto3);
		mesa2.addVoto(voto4);
		
		mesa3.addVoto(voto5);
		mesa3.addVoto(voto6);
		
		mesa4.addVoto(voto7);
		mesa4.addVoto(voto8);
		
		mesa5.addVoto(voto9);
		mesa5.addVoto(voto10);
		
		mesa6.addVoto(voto11);
		mesa6.addVoto(voto12);
		mesa6.addVoto(voto13);
		
		System.out.println(tandil.getCantVotosPor(new FiltroVotosPorCandidato(cand1)));
		System.out.println(mesa6.getCantVotosPor(new FiltroPorVotosEnBlanco()));
		System.out.println(mesa6.getPorcentajeVotosPor(new FiltroVotosPorCandidato(cand3)));
		
		System.out.println(elec.getCandidatos());
		
		
	}

	

	
}
