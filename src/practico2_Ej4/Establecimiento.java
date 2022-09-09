package practico2_Ej4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Establecimiento {
	private String nombre;
  	private ArrayList <Turno> turnos;
  
  	public Establecimiento(String nombre){
      this.nombre = nombre;
      turnos = new ArrayList<>();
    }
  
  	public void addTurno(Turno t){
      turnos.add(t);
    }
  
  	
  	public boolean checkUsuarioEsSocio(Usuario us) {
  		ArrayList <Turno> turnosUltimos2Meses = new ArrayList<>();
  		turnosUltimos2Meses = this.getTurnosUltimosDosMeses();
  		int cantTurnosTomados = 0;
  		
  		for(int i = 0; i< turnosUltimos2Meses.size();i++) {
  			if(turnosUltimos2Meses.get(i).getUs() == us) {
  				cantTurnosTomados++;
  			}
  		}
  		
  		if(cantTurnosTomados >= 4) {
  			return true;
  		}else {
  			return false;
  		}
  		
  	}
  	
  	public String getNombre() {
		return nombre;
	}

	public ArrayList <Turno> getTurnosUltimosDosMeses(){
      ArrayList <Turno> turnosUltimos2Meses = new ArrayList<>();
      LocalDate fechaHoy = LocalDate.now();
      LocalDate fechaHaceDosMeses = fechaHoy.minusMonths(2);
      
      for(int i=0; i<turnos.size();i++){
        if(turnos.get(i).getDia().isAfter(fechaHaceDosMeses)){
          turnosUltimos2Meses.add(turnos.get(i));
        }
      }
      
      return turnosUltimos2Meses;
    }
}
