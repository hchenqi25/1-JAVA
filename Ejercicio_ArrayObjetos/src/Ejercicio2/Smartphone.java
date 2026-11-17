package Ejercicio2;

public class Smartphone extends Dispositivo {
	int tamaño;
	int anchura;
	int memoria;
	
	public void setMemoria(int m) {
		memoria = m;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public void mostrarInfo() {
		System.out.println("Memoria: " + getMemoria());
	}

}
