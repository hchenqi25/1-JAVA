package Trabajador;

public class Programador   extends Trabajador{
	public Programador(int x) {
		
		this();
		
		System.out.println("Soy programador ");
	}
	
	public Programador() {
		
	}

	public void saludar() {
		
		 super.saludar();
		System.out.println("Hola soy programador");
	}

}
