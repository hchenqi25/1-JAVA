package Tienda;

public class ProductoElectronico extends Producto {
	private String marca;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String nuevaMarca) {
		marca = nuevaMarca;
	}
	
	public void mostrarInfo() {
		System.out.println("Marca: " + marca);
        System.out.println("Código del producto: " + codigo);
	}

}
