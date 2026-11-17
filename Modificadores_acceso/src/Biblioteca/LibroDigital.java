package Biblioteca;

public class LibroDigital extends Libro {
	private double tamanoMB;
	
	public double getTamanoMB() {
		return tamanoMB;
	}
	
	public void setTamanoMB( double peso) {
		tamanoMB = peso;
	}
	
	public void mostrarInformacionDigital() {
		System.out.println("Tamaño del archivo: " + getTamanoMB());
		
		 mostrarInfo();
	}
	
}
