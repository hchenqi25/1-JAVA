package Relacion2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Map<String, Double> productos = new HashMap<>();
        productos.put("Pan", 1.20);
        productos.put("Leche", 0.95);
        productos.put("Huevos", 2.50);

        System.out.println("Mapa original de productos:");
        System.out.println(productos);

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce el nombre del producto a actualizar o agregar: ");
            String producto = sc.nextLine();

            actualizarOAgregar(productos, producto, sc);

            System.out.println("Mapa actualizado:");
            System.out.println(productos);

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    
    public static void actualizarOAgregar(Map<String, Double> mapa, String producto, Scanner sc) {
        if (mapa.containsKey(producto)) {
            System.out.println("El producto existe. Precio actual: " + mapa.get(producto));
            System.out.print("Introduce el nuevo precio: ");

            try {
                double nuevoPrecio = Double.parseDouble(sc.nextLine());
                mapa.put(producto, nuevoPrecio);
                System.out.println("Precio actualizado correctamente.");
            } catch (NumberFormatException e) {
                System.out.println("Error: el precio introducido no es válido.");
            }

        } else {
            System.out.println("El producto no existe. Se añadirá con precio predeterminado de 5 euros.");
            mapa.put(producto, 5.0);
        }
    }
}