package practico8_Ej4;

import java.util.ArrayList;

public class Localidad extends ElementoVotacion {
	
	protected ArrayList<ElementoVotacion> elementosTerritoriales;  // Los elementos territoriales en el caso de la localidad van a ser barrios, en el caso de los barrios establecimientos, etc
	protected MesaVotacion mesaVotacionEspecial;	 
	
	public Localidad() {
		this.elementosTerritoriales = new ArrayList<>();
		this.mesaVotacionEspecial = new MesaVotacion();
	}
	
	public void addBarrio(Barrio b) {
		elementosTerritoriales.add(b);
	}
	
	public void addVotanteAMesaEspecial(Votante votante) {
		mesaVotacionEspecial.addVotanteAMesa(votante);
	}
	
	public void addVotoAMesaEspecial(Voto voto) {
		mesaVotacionEspecial.addVoto(voto);
	}
	
	@Override
	public int getCantVotosPor(Filtro f) {
		int sumadorVotos = 0;
	
		for(int i = 0; i < elementosTerritoriales.size(); i++) {
			ElementoVotacion elem = elementosTerritoriales.get(i);
			int sumaHijos = elem.getCantVotosPor(f);
			sumadorVotos += sumaHijos;
		}
		
		return sumadorVotos;
	}


	@Override
	public int getCantTotalVotos() {
		int sumadorVotos = 0;
		
		for(int i = 0; i < elementosTerritoriales.size(); i++) {
			ElementoVotacion elem = elementosTerritoriales.get(i);
			int sumaHijos = elem.getCantTotalVotos();
			sumadorVotos += sumaHijos;
		}
		
		return sumadorVotos;
	}

}
