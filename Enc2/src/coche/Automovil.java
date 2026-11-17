package coche;

public class Automovil {

	private String marca;
	private String modelo;
	private int velocidad;

	public void setMarca(String nuevaMarca) {
		marca = nuevaMarca;
	}

	public String getMarca() {
		return marca;
	}

	public void setModelo(String nuevoModelo) {
		modelo = nuevoModelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setVelocidad(int nuevaVelocidad) {
		if (nuevaVelocidad >= 0) {
			velocidad = nuevaVelocidad;
		} else {
			throw new IllegalArgumentException("La velocidad no puede ser negativa");
		}
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setAceleracion(int incremento) {
		velocidad += incremento;
	}

	public void setFrenar(int decremento) {
		if (decremento < 0) {
			throw new IllegalArgumentException("La frenada no puede ser negativa");
		}

		velocidad -= decremento;

		if (velocidad < 0) {
			velocidad = 0;
		}
	}

	public void mostrarInfo() {
		System.out.println("-----------------DETALLES DEL COCHE----------------");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Velocidad: " + velocidad);
	}

}
