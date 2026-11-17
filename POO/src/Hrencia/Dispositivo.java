package Hrencia;

public class Dispositivo {
	private String marca;
	private  double precio;
	
	public void setMarca(String m) {
		marca =m;
	}
	public String getMarca() {
		return marca;
	}
	public void setPrecio(double p) {
		if(p>0) {
			precio = p;
		}
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void mostrarInfo() {
		System.out.println("Marca => " + marca);
		System.out.println("Precio => " + precio);
	}

}
