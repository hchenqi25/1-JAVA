package Ejercicio1;

public class Automovil extends Vehiculo {
	String marca;
	String tipo;
	int plazas;
	int potencia;

	public Automovil() {
		System.out.println("Creando automovil");
	}

	public void setPotencia(int po) {
		potencia = po;

	}

	public int getPotencia() {
		return potencia;
	}

	public void mostrarInfo() {
		System.out.println("Potencia: " + getPotencia());
	}

}
