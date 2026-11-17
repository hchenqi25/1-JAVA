package Ejercicio1;

public class Vehiculo {
	String marca;
	String tipo;
	int plazas;

	public Vehiculo() {
		System.out.println("---------------Creando vehiculo-----------------");
	}

	public void setMarca(String m) {

		marca = m;
	}

	public String getMarca() {
		return marca;
	}

	public void setTipo(String t) {
		tipo = t;
	}

	public String getTipo() {
		return tipo;
	}

	public void setPlazas(int p) {
		plazas = p;

	}

	public int getPlazas() {
		return plazas;
	}

	public void mostrarInfo() {
		System.out.println("Marca: " + getMarca());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Plazas: " + getMarca());
	}

}
