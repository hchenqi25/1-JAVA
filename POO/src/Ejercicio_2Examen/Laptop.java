package Ejercicio_2Examen;

public class Laptop  extends Dispositivo{
	
	
	private String procesador;
	private int ram;
	
	
	public Laptop(String marca, String modelo, double precio, String procesador, int ram) {
		super(marca, modelo, precio);
		this.procesador=procesador;
		this.ram = ram;
	}
	
	public void setProcesador() {
		
	}
	
	public String getProcesador() {
		return procesador;
	}
	
	public void setRam() {
		
	}
	
	public int getRam() {
		return ram;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Marca => " + getMarca());
		System.out.println("Modelo => " + getModelo() ) ;
		System.out.println("Precio => " + getPrecio());
		System.out.println("Procesador => " + getProcesador());
		System.out.println("Ram => " + getRam());
		
	}
	

}
