package ejercicio3;

public class Vehiculo {

	protected String marca;
	protected String modelo;
	protected int cilindrada;
	protected double potencia;
	protected int cantidaddeRuedas;
	protected double velocidad;
	protected double circular;

	public Vehiculo() {
		cantidaddeRuedas = 4;
	}

	public Vehiculo(int v, int c) {
		velocidad = v;
		circular = c;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String nuevaMarca) {
		marca = nuevaMarca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String nuevoModelo) {
		modelo = nuevoModelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int nuevaCilindrada) {
		cilindrada = nuevaCilindrada;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double nuevaPotencia) {
		potencia = nuevaPotencia;
	}

	public int getcantidadeRuedas() {
		return cantidaddeRuedas;
	}

	public void setCantidadRuedas(int numero) {
		cantidaddeRuedas = numero;
	}

	public void Circular() {
		velocidad = 50;
	}

	public void Circular(double v) {
		velocidad = v;
	}

	public void caracteristicas() {
		System.out.println("La marca es: " + marca);
		System.out.println("El modelo es: " + modelo);
		System.out.println("La cilindrada es: " + cilindrada);
		System.out.println("La potencia es de: " + potencia);
		System.out.println("La velocidad actual es: " + velocidad);
	}
}