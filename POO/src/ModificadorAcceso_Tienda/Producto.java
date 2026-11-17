package ModificadorAcceso_Tienda;

public class Producto {

	private String nombre;
	private double precio;
	private int cantidad;
	String codigo;

	public void setNombre(String n) {
		nombre = n;
	}

	public String getNombre() {
		return nombre;
	}

	public void setPrecio(double p) {
		precio = p;
	}

	public double getPrecio() {
		return precio;
	}

	public void setCantidad(int c) {
		cantidad = c;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCodigo(String co) {
		codigo = co;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre del producto => " + nombre);
		System.out.println("Precio del producto => " + precio);
	}
	
	private void calcularDescuento() {
		double descuento = precio * 0.05;
		System.out.println("Precio => " + descuento);
	}

}
