package practico4_Ej6;

public class Usuario extends PersonasAsociadas {
	private String nombreUsuario, password;

	public Usuario(String nombre, String apellido, int edad, String nombreUsuario, String password) {
		super(nombre, apellido, edad);
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}
}
