package ejercicio2;

import miLibreria.Entrada;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrada entrada = new Entrada();
		int i;
			
		Password[] passwd = new Password[entrada.obtenerEntero("Introduce la cantidad de Passwords")];
		for(i=0;i<passwd.length;i++){
			passwd[i]=new Password(entrada.obtenerEntero("De que longitud quieres la contraseña numero " + (i+1) + ": "));
		}
		System.out.println("Nº\tFortaleza\tContraseña");
		System.out.println("--------------------------------------");
		for(i=0;i<passwd.length;i++){
			passwd[i].generarPassword();
			System.out.printf("%s\t%s\t\t%s%n",(i+1),passwd[i].esFuerte(),passwd[i].getContraseña());
		}
	}

}
