package Tienda;

public class Producto {
	
	protected String nombre;
	protected double precio;
	protected int cantidad;
	

	
public Producto() {
	nombre ="ALAN";
	precio=2.50;
	cantidad =1;

}

public void msotrarInfo() {
	System.out.println("Nombre del producto: " + nombre);
	System.out.println("Precio del productp: " + precio);
	System.out.println("Cantidad del producto: " + cantidad);
}

}
