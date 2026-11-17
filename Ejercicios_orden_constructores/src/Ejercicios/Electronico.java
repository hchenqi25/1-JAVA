package Ejercicios;

public class Electronico extends Producto {

    String nombre;
    String fabricante;
    int voltaje;

    public Electronico() {
    	voltaje = 220;


        System.out.println("Constructor de Electronico ejecutado");
        System.out.println("Voltaje: " + voltaje);
    }
}