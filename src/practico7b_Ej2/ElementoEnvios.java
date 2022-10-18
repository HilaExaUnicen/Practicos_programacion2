package practico7b_Ej2;

public abstract class ElementoEnvios {
	private String trackingID, ciudadDestino;
	
	public ElementoEnvios(String trackingID, String ciudadDestino) {
		this.trackingID = trackingID;
		this.ciudadDestino = ciudadDestino;
	}

	public String getTrackingID() {
		return trackingID;
	}

	public void setTrackingID(String trackingID) {
		this.trackingID = trackingID;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}
	
	public abstract double getPeso();
	public abstract String getDestinatario();
	public abstract String getRemitente();
	public abstract String getDireccionDestino();
	
	
	
	
	
}
