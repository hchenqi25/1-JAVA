package Ejercicios;

public class Computadora extends Electronico {

    public Computadora() {

      
        System.out.println("Constructor de Producto ejecutado");
        System.out.println("Nombre: Dispositivo");
        System.out.println("Fabricante: Genérico");

       
        System.out.println("Constructor de Electronico ejecutado");
        System.out.println("Voltaje: 220V");

       
        System.out.println("Constructor de Computadora ejecutado");
        System.out.println("Procesador: Intel Core i7");
        System.out.println("RAM: 16GB");
    }
}