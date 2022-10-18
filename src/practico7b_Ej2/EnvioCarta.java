package practico7b_Ej2;

public class EnvioCarta extends ElementoEnvios {
	private String destinatario, remitente, direccionDestino;
	private double peso;
	private boolean retiraEnSucursal;

	public EnvioCarta(String trackingID, String ciudadDestino, String destinatario, String remitente,
			String direccionDestino, double peso, boolean retiraEnSucursal) {
		super(trackingID, ciudadDestino);
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.direccionDestino = direccionDestino;
		this.peso = peso;
		this.retiraEnSucursal = retiraEnSucursal;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public String getRemitente() {
		return remitente;
	}

	public String getDireccionDestino() {
		return direccionDestino;
	}

	public double getPeso() {
		return peso;
	}

	public boolean retiraEnSucursal() {
		return retiraEnSucursal;
	}

	 
	
	

	
	
	
}
