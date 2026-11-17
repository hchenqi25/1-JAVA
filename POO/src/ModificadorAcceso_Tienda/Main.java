package ModificadorAcceso_Tienda;

public class Main {

	public static void main(String[] args) {
		Producto producto1 = new Producto();
		producto1.setNombre("Camiseta");
		producto1.setPrecio(19.99);
		producto1.setCantidad(10);
		producto1.setCodigo("C123");
		ProductoElectronico productoElectronico1 = new ProductoElectronico();
		productoElectronico1.setNombre("Laptop");
		productoElectronico1.setPrecio(899.99);
		productoElectronico1.setCantidad(5);
		productoElectronico1.setCodigo("L456");
		productoElectronico1.setMarca("Dell");
		producto1.mostrarInfo();
		productoElectronico1.mostrarInfoElectronico();
		Tienda tienda = new Tienda();
		tienda.agregarProducto(producto1);
		tienda.agregarProducto(productoElectronico1);
		tienda.mostrarStock();

	}

}
