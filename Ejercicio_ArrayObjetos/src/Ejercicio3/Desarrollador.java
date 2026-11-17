package Ejercicio3;

public class Desarrollador extends Empleado {
	
	String lenguaje;
	
	public void setLenguaje(String l) {
		lenguaje = l;
	}
	
	public String getLenguaje() {
		return lenguaje;
	}
	
	public void mostrarInfo() {
		System.out.println("Lenguaje de programacion: " + lenguaje );
	}

}
