package practico5_Ej2;

public class CasaEnemistada extends Casa {
	private String casaEnemiga;

	public CasaEnemistada(String nombre, int cantMaxAlumnos, String casaEnemiga) {
		super(nombre, cantMaxAlumnos);
		this.casaEnemiga = casaEnemiga;
	}
	
	@Override
	public boolean checkAlumnoEsApto(Alumno a) {
		if(super.checkAlumnoEsApto(a)) {
			if(this.casaEnemiga.equals(a.getCasa())==false) { //Si el alumno ya pertenece a la casa enemiga no podra entrar
				return true;
			}
		}
		return false;
	}
	
	

}
