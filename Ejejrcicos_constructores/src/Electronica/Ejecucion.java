package Electronica;

public class Ejecucion {

	public static void main(String[] args) {
		Inventario i = new Inventario(9);
		
		ProductoElectrico  pe = new ProductoElectrico();
		Televisor t = new Televisor();
		
		i.agregarProducto(pe);
		i.agregarProducto(t);
		
		i.mostrarProductos();

	}

}
