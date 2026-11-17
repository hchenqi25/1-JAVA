package Ejercicio3;

public abstract class auto {
	protected String marca;
	protected String modelo;
	protected int velocidadMaxima;
	protected double distanciaRecorrida;

	public auto(String marca, String modelo, int velocidadMaxima) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
		this.distanciaRecorrida = 0;
	}
 
	public void avanzar() {
		distanciaRecorrida += Math.random() * velocidadMaxima;
	}

	public double getDistancia() {
		return distanciaRecorrida;
	}

	public String getNombre() {
		return marca + " " + modelo;
	}

	public abstract String getTipo();
}