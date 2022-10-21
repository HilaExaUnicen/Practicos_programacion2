package practico8_Ej3;

import java.util.ArrayList;

public class Buzon extends Elemento{
	private static int staticId = 1;
	private int idBuzon;
	private ArrayList<String> dniNiniosBuenos;
	private ArrayList<Carta> cartasDepositadas;
	
	
	public Buzon() {
		this.dniNiniosBuenos = new ArrayList<>();
		this.cartasDepositadas = new ArrayList<>();
		this.idBuzon = staticId;
		staticId++;
	}
	
	public void addNinioBueno(String dniNinioBueno) {
		dniNiniosBuenos.add(dniNinioBueno);
	}
	
	
	public void depositarCarta(Carta carta) {
		if(!cartasDepositadas.contains(carta)) {
			if(this.dniNiniosBuenos.contains(carta.getDniRemitente())) {
				cartasDepositadas.add(carta);
			}
			else {//Es un ninio malo si no esta en la lista de niniosBuenos.
				carta.borrarRegalosYAgregarCarbon();
				cartasDepositadas.add(carta);
			}
		}
	}
	
	
	public ArrayList<Carta> getCartasPor(Filtro filtro) {
		ArrayList<Carta> resultado = new ArrayList<>();
		
		for(int i = 0; i < cartasDepositadas.size(); i++) {
			Carta cartaIndex = cartasDepositadas.get(i);
			if(filtro.cumpleCondicion(cartaIndex)) {
				resultado.add(cartaIndex);
			}
		}
		
		return resultado;
	}
	
	public int getCantCartasPor(Filtro filtro) {
		int resultadoSumaCartas = 0;
		for(int i = 0; i < cartasDepositadas.size(); i++) {
			Carta cartaIndex = cartasDepositadas.get(i);
			if(filtro.cumpleCondicion(cartaIndex)) {
				resultadoSumaCartas++;
			}
		}
		
		return resultadoSumaCartas;
	}
	
	public int getCantTotalCartasRecibidas() {
		return cartasDepositadas.size();
	}
	
	
	
	
	
	public boolean equals(Object o) {
		try {
			Buzon otro = (Buzon) o;
			return this.getIdBuzon() == (otro.getIdBuzon()); //Se usa == porque es un int
		} 
		catch (Exception e) {
			return false;
		}
	}

	public int getIdBuzon() {
		return idBuzon;
	}
	
	
	
	
	
	
}
