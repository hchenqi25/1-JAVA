package Ejercicio4;

public class Guitarra extends Instrumento {
	String tipo;
	
	public  Guitarra(String t) {
		 tipo = t;
	}
	
	public  String Sonido(String sonido) {
		sonido = "Rasqueando cuerdas";
		return "La guitarra es : " + tipo + " " + "y suena: " + sonido; 
	}

}
