package ejercicio2;

public class Password {
	private final static int DEFAULT_LONG = 10;
	private final static int SECURE_PASSWD_MAYUS = 2;
	private final static int SECURE_PASSWD_MINUS = 1;
	private final static int SECURE_PASSWD_NUM = 4;

	private int longitud;
	private String contraseña;

	public Password() {
		this.longitud = DEFAULT_LONG;
		this.contraseña = generarPassword();
	}

	public void setLongitud(int longitud) {

		this.longitud = longitud;

	}

	public int getLongitud() {

		return this.longitud;

	}

	public String getContraseña() {
		return this.contraseña;
	}

	public String generarPassword() {

		contraseña = "";
		for (int i = 0; i < this.longitud; i++) {

			switch ((int) (Math.random() * 3)) {
			case 0:
				contraseña += (char) (Math.random() * 26 + 'A');
				break;
			case 1:
				contraseña += (char) (Math.random() * 26 + 'a');
				break;
			case 2:
				contraseña += (char) (Math.random() * 10 + '0');
				break;
			}
		}

		return contraseña;
	}

	public boolean esFuerte() {
		int mayusculas = 0, minusculas = 0, numeros = 0;

		for (int i = 0; i < this.longitud; i++) {
			if (this.contraseña.charAt(i) >= 'A' && this.contraseña.charAt(i) <= 'Z')
				mayusculas++;
			if (this.contraseña.charAt(i) >= 'a' && this.contraseña.charAt(i) <= 'z')
				minusculas++;
			if (this.contraseña.charAt(i) >= '0' && this.contraseña.charAt(i) <= '9')
				numeros++;
		}
		return (mayusculas > SECURE_PASSWD_MAYUS && minusculas > SECURE_PASSWD_MINUS && numeros > SECURE_PASSWD_NUM)
				? true : false;
	}
}
