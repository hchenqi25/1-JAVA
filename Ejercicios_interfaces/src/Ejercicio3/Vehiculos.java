package Ejercicio3;

public abstract class Vehiculos implements Conductible {

	protected String marca;
	protected String modelo;
	protected int velocidad;

	public Vehiculos(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = 0;
	}

	public void mostrarInfo() {
		System.out.println(marca + " " + modelo + " | Velocidad: " + velocidad + " km/h");
	}
}