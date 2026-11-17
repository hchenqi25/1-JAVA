package Ejercicio4;

public class Dispositivo {
	private String marca;
	private double precio;
	
	public void setMarca(String nuevaMarca) {
		marca = nuevaMarca;
	}
	
	public String getmarca() {
		return marca;
	}
	
	
	
	public void setPrecio(double nuevoPrecio) {
		precio = nuevoPrecio;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void mostrarInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Precio: " + precio);
	}

}
