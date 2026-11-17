package Trabajador;

public class Analista extends Trabajador {
	public Analista() {
		System.out.println("Soy analista");
	}
	public Analista(int y) {
		this();
	}
	
	 public void saludar() {
		 super.saludar();
		System.out.println("Hola  que tal soy Analista" );	}

}
