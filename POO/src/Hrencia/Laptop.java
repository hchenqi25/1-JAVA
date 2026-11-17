package Hrencia;

public class Laptop extends Dispositivo {
	private int ramGB;
	
	public void setRamGB(int rgb) {
		if(rgb >0) {
			ramGB = rgb;
		}
	}
	public int getRamGB() {
		return ramGB;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Marca => " + getMarca());
		System.out.println("Precio => " + getPrecio());
		System.out.println("RAM => " +  ramGB + " GB");
	}

}
