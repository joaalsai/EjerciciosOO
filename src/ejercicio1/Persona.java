package ejercicio1;

public class Persona {
	private final static char DEFAULT_SEX = 'H';
	private String nombre;
	private int edad;
	private int DNI;
	private char letraDNI;
	private char sexo;
	private float peso;
	private float altura;
	
	public Persona(){
		nombre	= "";
		edad	= 0;
		DNI		= generaDNI();
		letraDNI= generaLetraDNI();
		sexo	= DEFAULT_SEX;
		peso	= 0;
		altura	= 0;
	}
	
	public Persona(String nombre,int edad,String sexo){
		this.nombre	= nombre;
		this.edad	= edad;
		DNI			= generaDNI();
		letraDNI	= generaLetraDNI();
		this.sexo	= comprobarSexo(sexo.charAt(0));
		peso		= 0;
		altura		= 0;
	}
	
	public Persona(String nombre,int edad,String sexo, float peso, float altura){
		this.nombre	= nombre;
		this.edad	= edad;
		this.DNI	= generaDNI();
		letraDNI	= generaLetraDNI();
		this.sexo	= comprobarSexo(sexo.charAt(0));
		this.peso	= peso;
		this.altura	= altura;
	}
	
	private char comprobarSexo(char sexo){
		if(sexo=='M' || sexo=='m') return 'M';
		else return 'H';
	}
	
	private int generaDNI(){
		return (int)(Math.random()*100000000);
	}
	
	private char generaLetraDNI();{
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		return letras.charAt(this.DNI%23);
	}
	
}
