package practico2_Ej4;

import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
	private double PRECIOCANCHAFUTBOL = 400;
	private double PRECIOCANCHAPADDLE = 100;
	private double DESCUENTO10FUTBOL = (0.1*PRECIOCANCHAFUTBOL);
	private double DESCUENTO10PADDLE = (0.1*PRECIOCANCHAPADDLE);
    
    private LocalDate dia;
    private LocalTime hora;
    private Cancha tipoCancha;
    private Usuario us;
    private double precio;
    private Establecimiento est;
    
  	public Turno(LocalDate dia, LocalTime hora, Cancha tipoCancha, Usuario us, Establecimiento est){
      this.dia = dia;
      this.hora = hora;
      this.tipoCancha = tipoCancha;
      this.us = us;
      this.est = est;
      
      if(tipoCancha.getTipoCancha().equals("Futbol")){                 //PREGUNTAR POR TIPO ESTA MAL HAY QUE CAMBIAR ESTO
    	  if(est.checkUsuarioEsSocio(us)) {
    		  this.precio = (PRECIOCANCHAFUTBOL - DESCUENTO10FUTBOL);
    	  }
    	  else {
    		  this.precio = PRECIOCANCHAFUTBOL; 
    	  }
      }
      else if(tipoCancha.getTipoCancha().equals("Paddle")){
    	  if(est.checkUsuarioEsSocio(us)) {
    		  this.precio = (PRECIOCANCHAPADDLE - DESCUENTO10PADDLE);
    	  }
    	  else {
    		  this.precio = PRECIOCANCHAPADDLE;
    	  }

      }
    }
  	
	public String toString() {
		return "Turno [dia=" + dia + ", hora=" + hora + ", tipoCancha=" + tipoCancha.getTipoCancha() + ", us=" + us.getNombre() + ", precio="
				+ precio + ", est=" + est.getNombre() + "]";
	}
  


	public double getPrecio() {
		return precio;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	public Usuario getUs() {
		return us;
	}

	public LocalDate getDia(){
      return this.dia;
    }
}