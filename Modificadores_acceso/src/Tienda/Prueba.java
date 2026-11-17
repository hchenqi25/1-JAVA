package Tienda;

public class Prueba {
    public static void main(String[] args) {

       
        Producto p1 = new Producto();
        p1.setNombre("Camiseta");
        p1.setPrecio(20.0);
        p1.setCantidad(10);
        p1.setCodigo("A123");

        ProductoElectronico p2 = new ProductoElectronico();
        p2.setNombre("Auriculares");
        p2.setPrecio(50.0);
        p2.setCantidad(5);
        p2.setCodigo("E456");
        p2.setMarca("Sony");

     
        Tienda tienda = new Tienda();

       
        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);

    
        System.out.println("----- Información del Producto -----");
        p1.mostrarInfo();

        System.out.println("\n----- Información del Producto Electrónico -----");
        p2.mostrarInfo();
         

     
        System.out.println("\n----- Total de Productos en la Tienda -----");
        tienda.mostrarTotalProductos();
    }
}