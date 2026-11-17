package Trabajador;

public class Ingeniero extends Trabajador  {
	public Ingeniero(){
		super();
		System.out.println("Soy ingeniero");
	}
	
	public Ingeniero(int z) {
		this();
	}
	public void saludar() {
		 super.saludar();
		System.out.println("Hola  que tal soy Ingeniero " );	}

}
