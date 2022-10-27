package practico8_Ej4;

import java.util.ArrayList;

public class SeccionElectoral extends ElementoVotacion {
	private ArrayList<ElementoVotacion> elementosTerritoriales;
	
	public SeccionElectoral() {
		this.elementosTerritoriales = new ArrayList<>();
	}
	
	public void addElemento(ElementoVotacion ev) { //El elemento a agregar puede ser un barrio, establecimiento o mesa de votacion;
		elementosTerritoriales.add(ev);
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
