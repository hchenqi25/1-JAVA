package ModificadorAcceso_Tienda;

public class Tienda {
	int totaldeproductos;
	
	public void agregarProducto(Producto producto) {
		totaldeproductos++;
		System.out.println("Poridcto agregado correctamente..." + producto.getNombre());
	}
	
	protected void mostrarStock() {
		System.out.println("Cantidad => " + totaldeproductos);
	}

}
