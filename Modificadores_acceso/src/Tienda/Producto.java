package Tienda;

public class Producto {
	private String nombre;
	private double precio;
	protected int cantidad;
	String codigo;
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre( String nuevoNombre) {
		nombre= nuevoNombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double nuevoPrecio) {
		precio = nuevoPrecio;
		
	}

	public void setCodigo(String c) {
        codigo = c;
    }

    public void setCantidad(int cant) {
        cantidad = cant;
    }

	public void mostrarInfo() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("Precio:" + precio);
	}
	
	
	
	
	private void CalcularDescuento() {
		double precioFinal = precio * 0.95;
		System.out.println("Precio con descuento: " + precioFinal);
	}

}



