package Tienda;

public class Prodcuto_Electronico extends Producto {
	private String marca;
	
	public Prodcuto_Electronico() {
		nombre = "Alargadera";
		precio =5;
		cantidad =2;
		marca ="ExtraCalidad";
		
	}
	
	public void mostrarInformacionElectronico() {
		System.out.println("Nombre del producto: " + nombre);
		System.out.println("Precio: " + precio);
		System.out.println("Cantidad del producto: " + cantidad);
		System.out.println("Marca: " + marca);
	}

}
