package Ejercicio4;

public class Laptop extends Dispositivo{
	private int Ram;
	
	public void setRam(int nuevoRam) {
		Ram = nuevoRam;
	}
	public int getRam() {
		return Ram;
	}
	public void mostrarInfo() {
		System.out.println("Ram: " + Ram);
		
	}

}
