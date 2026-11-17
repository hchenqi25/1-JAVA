package Ej1;

public class Vehiculo {
	String marca;
	String modelo;
	
	public Vehiculo(String m, String mo) {
		this.marca = m;
		this.modelo =mo;
	}
	
	public Vehiculo() {
		this("Desconocido","Desconocido");
	}
	public void mostrarInfo() {
        System.out.println("Vehículo - Marca: " + marca + ", Modelo: " + modelo);
    }


}
