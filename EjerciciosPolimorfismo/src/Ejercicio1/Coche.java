package Ejercicio1;

public class Coche extends Vehiculo {

    String marcaCoche;
    int puertas;

    public Coche(String m, int p) {
        marcaCoche = m;
        puertas = p;
    }

  
    public String obtenerDescripcion() {
        return "Coche de la marca " + marcaCoche + " con " + puertas + " puertas";
    }

 
    public String obtenerDescripcion(String combustible) {
        return "Coche de la marca " + marcaCoche + " con " + puertas +
               " puertas, usa " + combustible;
    }
}