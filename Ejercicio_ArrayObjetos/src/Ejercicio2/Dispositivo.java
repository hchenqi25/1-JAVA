package Ejercicio2;

public class Dispositivo {
	int tamaño;
	int anchura;
	
	
	public Dispositivo(){
		System.out.println("------------------CREANDO DISPOSITIVO---------------------------");
		
	}
	
	public void setTamaño(int t) {
		tamaño = t;
	}
	
	public int getTamaño() {
		return tamaño;
	}
	
	public void setAnchura(int a) {
		anchura = a;
	}
	
	public int getAnchura() {
		return anchura;
	}
	
	public void mostrarInfo() {
		System.out.println("Tamaño:" + getTamaño());
		System.out.println("Anchura: " + getAnchura());
	}

}
