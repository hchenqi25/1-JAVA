package Tienda;

public class Tienda {

    int totalProductos;   

    public void agregarProducto(Producto producto) {
        totalProductos++;
    }

    protected void mostrarTotalProductos() {
        System.out.println("Total de productos en la tienda: " + totalProductos);
    }
}