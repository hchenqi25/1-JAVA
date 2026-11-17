package Coche;

public class coche {

	private String marca;
	private String modelo;
	private int cilindrada;
	private double potencia;

	public coche() {
		marca = "Ferrari";
		modelo = "GT";
		cilindrada = 50;
		potencia = 95.65;
	}

	public String getMarca() {
		return marca;
	}

	public void setmarca(String nuevamarca) {
		marca = nuevamarca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setmodelo(String nuevomodelo) {
		modelo = nuevomodelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setcilindrada(int nuevacilindrada) {
		cilindrada = nuevacilindrada;
	}

	public double getpotencia() {
		return potencia;
	}

	public void setpotencia(double nuevapotencia) {
		potencia = nuevapotencia;
	}

	public void caracteristicas() {
		System.out.println("El coche es de la marca: " + marca);
		System.out.println("Pertenece al modelo: " + modelo);
		System.out.println("Tiene una cilindrada de: " + cilindrada);
		System.out.println("Tine una potencia de: " + potencia);
	}
}
