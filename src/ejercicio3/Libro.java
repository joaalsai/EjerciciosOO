package ejercicio3;

public class Libro {
	private String titulo;
	private String autor;
	private int numeroDeEjemplares;
	private int numeroDeEjemplaresPrestados;
	
	/**************************/
	/* 		Constructores	  */	
	/**************************/
	public Libro(){
		titulo						= "";
		autor						= "";
		numeroDeEjemplares			= 0;
		numeroDeEjemplaresPrestados	= 0;
	}	
	public Libro(String titulo,String autor, int numeroDeEjemplares, int numeroDeEjemplaresPrestados){
		this.titulo							= titulo;
		this.autor							= autor;
		this.numeroDeEjemplares				= numeroDeEjemplares;
		this.numeroDeEjemplaresPrestados	= numeroDeEjemplaresPrestados;
	}
	
	/**************************/
	/* 		  setters   	  */	
	/**************************/
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public void setAutor(String autor){
		this.autor = autor;
	}
	public void setNumeroDeEjemplares(int num){
		this.numeroDeEjemplares = num;
	}
	public void setNumeroDeEjemplaresPrestados(int num){
		this.numeroDeEjemplaresPrestados = num;
	}
	
	/**************************/
	/* 		  getters   	  */	
	/**************************/
	public String getTitulo(){
		return titulo;
	}
	public String getAutor(){
		return autor;
	}
	public int getNumeroDeEjemplares(){
		return numeroDeEjemplares;
	}
	public int getNumeroDeEjemplaresPrestados(){
		return numeroDeEjemplaresPrestados;
	}

	/**************************/
	/* 		  metodos   	  */	
	/**************************/	
	public boolean prestamo(){
		if(this.numeroDeEjemplares<=this.numeroDeEjemplaresPrestados) return false;
		else {
			this.numeroDeEjemplaresPrestados++;
			return true;
		}
	}	
	public boolean devolucion(){
		if(this.numeroDeEjemplaresPrestados<=0) return false;
		else {
			this.numeroDeEjemplaresPrestados--;
			return true;
		}
	}
	public String toString(){
		return 	"Datos del Libro:\n" +
				"-------------------------------\n" +
				"Titulo: " + this.titulo + "\n" +
				"Autor: " + this.autor + "\n" +
				"Numero de ejemplares: " + this.numeroDeEjemplares + "\n" +
				"Numero de ejemplares prestados: " + this.numeroDeEjemplaresPrestados + "\n";
	}

}
