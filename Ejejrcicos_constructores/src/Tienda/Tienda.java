package Tienda;
public class Tienda {

    private Producto[] productos;
    private int contador; 

    
    public Tienda(int capacidad) {
        productos = new Producto[capacidad];
        contador = 0;
    }

    
    public void agregarProducto(Producto p) {
        if (contador < productos.length) {
            productos[contador] = p;
            contador++;
            System.out.println("Producto agregado correctamente.");
        } else {
            System.out.println("La tienda está llena. No se pueden agregar más productos.");
        }
    }

    
    public void mostrarProductos() {
        if (contador == 0) {
            System.out.println("No hay productos en la tienda.");
            return;
        }

        System.out.println("Productos en la tienda:");
        for (int i = 0; i < contador; i++) {
            productos[i].msotrarInfo();
            System.out.println("----------------------");
        }
    }
}