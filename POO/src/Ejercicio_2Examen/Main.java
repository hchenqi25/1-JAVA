package Ejercicio_2Examen;

public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario(); 

        inventario.añadirDispositivo(new Smartphone("Samsung", "Galaxy S24", 999.99, "Android", 256));
        inventario.añadirDispositivo(new Smartphone("Apple", "iPhone 15", 1199.99, "iOS", 128));
        inventario.añadirDispositivo(new Smartphone("Xiaomi", "Redmi Note 13", 299.99, "Android", 128));

        inventario.añadirDispositivo(new Laptop("Apple", "MacBook Air", 1299.99, "Apple M2", 16));
        inventario.añadirDispositivo(new Laptop("Lenovo", "ThinkPad X1", 1499.99, "Intel i7", 32));

        inventario.mostrarTodos();
    }
}