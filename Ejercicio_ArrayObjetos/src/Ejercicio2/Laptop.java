package Ejercicio2;

public class Laptop extends Dispositivo {
	String procesador;
	int RAM;
	
	
	public void setProcesador(String pro) {
		procesador = pro;
	}
	
	public String getProcesador() {
		return procesador;
	}
	
	public void setRAM(int r) {
		RAM =r;
	}
	
	public int getRam() {
		return RAM;
	}
	
	
	public void mostrarInfo() {
		System.out.println("Porcesador: " + getProcesador());
		System.out.println("RAM: " + getRam());
	}

}
