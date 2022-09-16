package practico5_Ej2;

public class CasaExigente extends Casa {

	public CasaExigente(String nombre, int cantMaxAlumnos) {
		super(nombre, cantMaxAlumnos);
	}
	
	@Override
	public boolean checkAlumnoEsApto(Alumno a) {
		if(super.checkAlumnoEsApto(a)) {
			for (int i = 0; i < this.alumnos.size(); i++) {
				if(a.contieneFamiliar(alumnos.get(i))) {
					return true;
				}
			}
			return false;
		}
		
		return false;
	}
}