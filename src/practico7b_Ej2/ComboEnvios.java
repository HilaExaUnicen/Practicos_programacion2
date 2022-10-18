package practico7b_Ej2;

import java.util.ArrayList;

public class ComboEnvios extends ElementoEnvios {
	private ArrayList<ElementoEnvios> envios;

	public ComboEnvios(String trackingID, String ciudadDestino) {
		super(trackingID, ciudadDestino);
		this.envios = new ArrayList<>();
	}

	public void addEnvio(ElementoEnvios elem) {
		if(this.getCiudadDestino().equals(elem.getCiudadDestino())) {
			envios.add(elem);
			elem.setTrackingID(this.getTrackingID()); //Cuando se agrega un envio al combo, este adopta el tracking id del combo que lo contiene
		}
	}
	
	public void setTrackingID(String trackingID){//Hay que sobreescribir el metodo en el caso de que el elemento sea un combo, que el cambio tambien se aplique a sus hijos
		
	}
	
	@Override
	public double getPeso() {
		double sumadorPeso = 0;
		for(int i = 0; i < envios.size(); i++) {
			sumadorPeso += envios.get(i).getPeso();
		}
		
		return sumadorPeso;
	}

	@Override
	public String getDestinatario() {
		return envios.get(0).getDestinatario();
	}

	@Override
	public String getRemitente() {
		return envios.get(0).getRemitente();
	}

	@Override
	public String getDireccionDestino() {
		return envios.get(0).getDireccionDestino();
	}
	
	
	
	
}
