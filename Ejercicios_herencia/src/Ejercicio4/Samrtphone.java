package Ejercicio4;

public class Samrtphone extends Dispositivo{
	private int almacenamiento;
	
	public void setAlmacenamiento(int capacidad) {
		almacenamiento = capacidad;
	}
	
	public int getAlmacenamiento() {
		return almacenamiento;
	}
	
	public void mostrarInfo() {
		System.out.println("Almacenamiento: " + almacenamiento);
		
	}

}
