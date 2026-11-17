package Ejercicio1;

public class Camion extends Vehiculo {
	String marca;
	String tipo;
	int plazas;
	int capacidad;

	public Camion() {
		System.out.println("Creando camion ");
	}

	public void setCapacidad(int c) {
		capacidad = c;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void mostrarInfo() {
		System.out.println("Capacidad: " + getCapacidad());
	}

}
