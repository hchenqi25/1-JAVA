package Electronica;

public class ProductoElectrico {
		protected String nombreProductoElectrico;
		protected double precioProductoElectrico;
		
		
public ProductoElectrico() {
	
	nombreProductoElectrico = "Alan";
	precioProductoElectrico = 500;
	
}

public void mostrarInfo() {
	System.out.println("Nombre del producto: " + nombreProductoElectrico);
	System.out.println("Precion del producto: " + precioProductoElectrico);
}
}
