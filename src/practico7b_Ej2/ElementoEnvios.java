package practico7b_Ej2;

public abstract class ElementoEnvios {
	private String trackingID, destinatario, remitente, direccionDestino, ciudadDestino;
	private double peso;
	
	public ElementoEnvios(String trackingID, String destinatario, String remitente, String direccionDestino,String ciudadDestino, double peso) {
		this.trackingID = trackingID;
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.direccionDestino = direccionDestino;
		this.ciudadDestino = ciudadDestino;
		this.peso = peso;
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

	public abstract String getDestinatario(); 
	
	
}
