package ejercicio3;

import miLibreria.Entrada;

public class Ejercicio3 {

	public static void main(String[] args) {
		int opcion;
		Libro[] libros = new Libro[6];
		inicializar(libros);
		Entrada entrada = new Entrada();
		boolean salir = false;

		do {
			borrarPantalla();
			mostrarMenuPrincipal();
			opcion = entrada.obtenerEntero("Elija una opcion (1-6)");
			if (opcion > 8 || opcion < 0) {
				System.out.println("Opcion no valida!!!. \nDebe elegir una opcion entre 1 y 8.\n0 para salir");
				entrada.obtenerString("Pulse [Intro] para continuar");
			} else {
				switch (opcion) {
				case 1:
					introducirLibro(libros);
					break;
				case 2:
					cambiarTitulo(libros);
					break;
				case 3:
					cambiarAutor(libros);
					break;
				case 4:
					cambiarEjemplares(libros);
					break;
				case 5:
					prestarLibro(libros);
					break;
				case 6:
					devolverLibro(libros);
					break;
				case 7:
					listarLibro(libros);
					break;
				case 8:
					listarLibros(libros);
					break;
				case 0:
					salir = true;
					break;
				}
			}
			borrarPantalla();
		} while (!salir);
		System.out.println("That's all folks!!!. \nGood bye!!!");
	}

	public static void mostrarSubMenu(Libro[] libros) {
		System.out.println("    Menu de la biblioteca    ");
		System.out.println("-----------------------------");
		for (int i = 0; i < libros.length; i++) {
			System.out.printf("%s- %s%n", (i + 1), libros[i].getTitulo());
		}
		System.out.println("-----------------------------");
		System.out.println("0- Salir");
	}
	public static void mostrarMenuPrincipal() {
		System.out.println("      Introducir Libro       ");
		System.out.println("-----------------------------");
		System.out.println("1- Introducir libro");
		System.out.println("2- Cambiar titulo de libro");
		System.out.println("3- Cambiar autor de libro");
		System.out.println("4- Cambiar cantidad de ejemplares");
		System.out.println("5- Prestar libros");
		System.out.println("6- Devolver libros");
		System.out.println("7- Consultar libro");
		System.out.println("8- Listar todos los libros");
		System.out.println("-----------------------------");
		System.out.println("0- Salir");
		System.out.println("-----------------------------");
	}
	public static void borrarPantalla() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
	public static void introducirLibro(Libro[] libros) {
		Entrada entrada = new Entrada();
		int libroSeleccionado;
		boolean salir = false;
		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro quieres introducir?");
			if(libroSeleccionado==0) salir=true;
			else if (libroSeleccionado<0 || libroSeleccionado>libros.length){
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.length + "\n Pulsa [Intro] para continuar.");
			} else {
				libros[libroSeleccionado-1].setTitulo(entrada.obtenerString("Dame el titulo para el libro " + libroSeleccionado));
				libros[libroSeleccionado-1].setAutor(entrada.obtenerString("Dame el autor para el libro " + libros[libroSeleccionado-1].getTitulo()));
				libros[libroSeleccionado-1].setNumeroDeEjemplares(entrada.obtenerEntero("Cuantos ejemplares hay para el libro " + libros[libroSeleccionado-1].getTitulo()));
				libros[libroSeleccionado-1].setNumeroDeEjemplaresPrestados(0);
			}
		} while (!salir);
	}
	public static void cambiarTitulo(Libro[] libros){
		Entrada entrada = new Entrada();
		int libroSeleccionado;
		boolean salir = false;
		
		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro quiere modificar ?");
			if(libroSeleccionado==0) salir=true;
			else if (libroSeleccionado<0 || libroSeleccionado>libros.length){
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.length + "\n Pulsa [Intro] para continuar.");
			} else {
				borrarPantalla();
				System.out.println("Libro seleccionado [" + libros[libroSeleccionado-1].getTitulo() +"].");
				libros[libroSeleccionado-1].setTitulo(entrada.obtenerString("Introduce el nuevo titulo para el libro seleccionado:"));
				entrada.obtenerString("Titulo del libro actualizado.\nPulsa [Intro] para continuar.");
			}
		} while (!salir);
	}
	public static void cambiarAutor(Libro[] libros){
		Entrada entrada = new Entrada();
		int libroSeleccionado;
		boolean salir = false;
		
		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro quiere modificar ?");
			if(libroSeleccionado==0) salir=true;
			else if (libroSeleccionado<0 || libroSeleccionado>libros.length){
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.length + "\n Pulsa [Intro] para continuar.");
			} else {
				borrarPantalla();
				System.out.println("Libro seleccionado [" + libros[libroSeleccionado-1].getTitulo() +"].");
				libros[libroSeleccionado-1].setAutor(entrada.obtenerString("Introduce el nuevo autor para el libro seleccionado:"));
				entrada.obtenerString("Autor del libro actualizado.\nPulsa [Intro] para continuar.");
			}
		} while (!salir);
	}
	public static void cambiarEjemplares(Libro[] libros){
		Entrada entrada = new Entrada();
		int libroSeleccionado;
		boolean salir = false;
		
		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro quiere modificar ?");
			if(libroSeleccionado==0) salir=true;
			else if (libroSeleccionado<0 || libroSeleccionado>libros.length){
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.length + "\n Pulsa [Intro] para continuar.");
			} else {
				borrarPantalla();
				System.out.println("Libro seleccionado [" + libros[libroSeleccionado-1].getTitulo() +"].");
				libros[libroSeleccionado-1].setTitulo(entrada.obtenerString("Introduce la cantidad de ejemplares para el libro seleccionado:"));
				entrada.obtenerString("Cantidad de ejemplares del libro actualizado.\nPulsa [Intro] para continuar.");
			}
		} while (!salir);
	}
	public static void prestarLibro(Libro[] libros) {
		Entrada entrada = new Entrada();
		int libroSeleccionado;
		boolean salir = false;
		
		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro se va a prestar ?");
			if(libroSeleccionado==0) salir=true;
			else if (libroSeleccionado<0 || libroSeleccionado>libros.length){
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.length + "\n Pulsa [Intro] para continuar.");
			} else {
				borrarPantalla();
				if(libros[libroSeleccionado-1].prestamo()==true) System.out.println("Libro prestado correctamente!.");
				else System.out.println("El libro no puede ser prestado. Consulte disponibilidad.");
				entrada.obtenerString("Pulsa [Intro] para continuar.");
			}
		} while (!salir);
	}
	public static void devolverLibro(Libro[] libros) {
		Entrada entrada = new Entrada();
		int libroSeleccionado;
		boolean salir = false;
		
		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro se va a devolver ?");
			if(libroSeleccionado==0) salir=true;
			else if (libroSeleccionado<0 || libroSeleccionado>libros.length){
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.length + "\n Pulsa [Intro] para continuar.");
			} else {
				borrarPantalla();
				if(libros[libroSeleccionado-1].devolucion()==true) System.out.println("Libro devuelto correctamente!.");
				else System.out.println("El libro no puede ser devuelto. Consulte si hay prestamos.");
				entrada.obtenerString("Pulsa [Intro] para continuar.");
			}
		} while (!salir);
	}
	public static void listarLibro(Libro[] libros) {
		Entrada entrada = new Entrada();
		int libroSeleccionado;
		boolean salir = false;
		
		do {
			borrarPantalla();
			mostrarSubMenu(libros);

			libroSeleccionado = entrada.obtenerEntero("Que libro quieres consultar?");
			if(libroSeleccionado==0) salir=true;
			else if (libroSeleccionado<0 || libroSeleccionado>libros.length){
				entrada.obtenerString("Valor incorrecto!.\nDebes introducir un valor entre 0 y " + libros.length + "\n Pulsa [Intro] para continuar.");
			} else {
				borrarPantalla();
				System.out.println(libros[libroSeleccionado-1].toString());	
				entrada.obtenerString("Pulsa [Intro] para continuar.");
			}
		} while (!salir);
		
	}
	public static void listarLibros(Libro[] libros) {
		Entrada entrada = new Entrada();
		borrarPantalla();
		for(int i=0;i<libros.length;i++){
			System.out.println(libros[i].toString());
		}
		entrada.obtenerString("Pulsa [Intro] para continuar.");
	}
	public static void inicializar(Libro[] libros) {
		for (int i = 0; i < libros.length; i++) {
			libros[i] = new Libro();
		}
	}
}
