package Electronica;

public class Inventario {
    private ProductoElectrico[] in;  
    private int contador;
    private int capacidad;
    
    public Inventario(int capacidad) {
        this.capacidad = capacidad;
        in = new ProductoElectrico[capacidad];
    }
    
    public void agregarProducto(ProductoElectrico p) {
        if (contador < capacidad) {
            in[contador] = p;
            contador++;
        } else {
            System.out.println("ALAN PUTON");
        }
    }
    
    public void mostrarProductos() {
        for (int i = 0; i < contador; i++) {
            in[i].mostrarInfo();   
        }
    }
}