package Ejercicios;

public class Portatil extends Computadora {

    public Portatil() {

        // Simula Producto
        System.out.println("Constructor de Producto ejecutado");
        System.out.println("Nombre: Dispositivo");
        System.out.println("Fabricante: Genérico");

        // Simula Electronico
        System.out.println("Constructor de Electronico ejecutado");
        System.out.println("Voltaje: 220V");

        // Simula Computadora
        System.out.println("Constructor de Computadora ejecutado");
        System.out.println("Procesador: Intel Core i7");
        System.out.println("RAM: 16GB");

        // Su propio mensaje
        System.out.println("Constructor de Portatil ejecutado");
        System.out.println("Peso: 1.5 kg");
        System.out.println("Autonomía: 10 horas");
    }
}