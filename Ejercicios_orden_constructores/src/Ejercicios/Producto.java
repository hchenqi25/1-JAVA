package Ejercicios;

public class Producto {

    String nombre;
    String fabricante;

    public Producto() {
        nombre = "Dispositivo";
        fabricante = "Generico";

        System.out.println("Constructor de Producto ejecutado");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fabricante: " + fabricante);
    }
}