package Ejercicio_2Examen;

public abstract class Dispositivo {
	
	private String marca;
	private String modelo;
	private double precio;
	
	public Dispositivo (String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio=precio;
	}
	
	public void setMarca() {
		
	}
	
	public String getMarca() {
		return marca;
	}
	 
	public void setModelo() {
		
	}
	
	
	public String getModelo() {
		return modelo;
	}
	
	public void setPrecio() {
		
	}
	
	public double getPrecio() {
		return precio;
	}
	public   abstract void  mostrarInfo();
	
	

}
