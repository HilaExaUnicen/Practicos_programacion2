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
		
		
		
		SeccionElectoral tandil = new SeccionElectoral();
		
		//barrio4.addEstablecimiento(est1);
		//barrio4.addEstablecimiento(est1);
		
		MesaVotacion mesa1 = new MesaVotacion();
		MesaVotacion mesa2 = new MesaVotacion();
		MesaVotacion mesa3 = new MesaVotacion();
		MesaVotacion mesa4 = new MesaVotacion();
		MesaVotacion mesa5 = new MesaVotacion();
		MesaVotacion mesa6 = new MesaVotacion();
		
		tandil.addElemento(mesa1);
		tandil.addElemento(mesa2);
		tandil.addElemento(mesa3);
		tandil.addElemento(mesa4);
		tandil.addElemento(mesa5);
		tandil.addElemento(mesa6);

		
		Votante votante1 = new Votante(1);
		Votante votante2 = new Votante(2);
		Votante votante3 = new Votante(3);
		Votante votante4 = new Votante(4);
		Votante votante5 = new Votante(5);
		Votante votante6 = new Votante(6);
		Votante votante7 = new Votante(7);
		Votante votante8 = new Votante(8);
		Votante votante9 = new Votante(9);
		Votante votante10 = new Votante(10);
		Votante votante11= new Votante(11);
		Votante votante12 = new Votante(12);
		Votante votante13 = new Votante(13);
		
		
		mesa1.addVotanteAMesa(votante1);
		mesa1.addVotanteAMesa(votante2);
		
		mesa2.addVotanteAMesa(votante3);
		mesa2.addVotanteAMesa(votante4);
	
		mesa3.addVotanteAMesa(votante5);
		mesa3.addVotanteAMesa(votante6);

		mesa4.addVotanteAMesa(votante7);
		mesa4.addVotanteAMesa(votante8);
		
		mesa5.addVotanteAMesa(votante9);
		mesa5.addVotanteAMesa(votante10);
		
		mesa6.addVotanteAMesa(votante11);
		mesa6.addVotanteAMesa(votante12);
		mesa6.addVotanteAMesa(votante13);
		
		Voto voto1 = new Voto(cand1, LocalTime.of(10, 0), votante1);
		Voto voto2 = new Voto(cand2, LocalTime.of(12, 0), votante2);
		Voto voto3 = new Voto(cand3, LocalTime.of(15, 0), votante3);
		Voto voto4 = new Voto(cand1, LocalTime.of(17, 0), votante4);
		Voto voto5 = new Voto(null, LocalTime.of(13, 0), votante5);
		Voto voto6 = new Voto(cand3, LocalTime.of(14, 0), votante6);
		Voto voto7 = new Voto(cand5, LocalTime.of(12, 0), votante7);
		Voto voto8 = new Voto(cand2, LocalTime.of(10, 0), votante8);
		Voto voto9 = new Voto(cand5, LocalTime.of(10, 0), votante9);
		Voto voto10 = new Voto(cand3, LocalTime.of(10, 0), votante10);
		Voto voto11 = new Voto(cand3, LocalTime.of(10, 0), votante11);
		Voto voto12 = new Voto(cand1, LocalTime.of(10, 0), votante12);
		Voto voto13 = new Voto(cand1, LocalTime.of(10, 0), votante13);
		
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
		System.out.println(mesa6.getPorcentajeVotosPor(new FiltroVotosPorCandidato(cand1)));
		
		System.out.println(elec.getCandidatos());
		
		
	}

	

	
}
