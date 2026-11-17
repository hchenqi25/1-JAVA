package Tienda;

public class Ejecucion {

    public static void main(String[] args) {

     
        Tienda tienda = new Tienda(5);


        Producto p1 = new Producto();
        Prodcuto_Electronico pe1 = new Prodcuto_Electronico();

     
        tienda.agregarProducto(p1);
        tienda.agregarProducto(pe1);

        tienda.mostrarProductos();

        System.out.println("Información del producto electrónico:");
        pe1.mostrarInformacionElectronico();
    }
}