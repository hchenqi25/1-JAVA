package Ejercicio1;

public class Moto extends Vehiculo {

    String marcaMoto;

    public Moto(String m) {
        marcaMoto = m;
    }

    public String obtenerDescripcion() {
        return "Moto de la marca " + marcaMoto + " con casco incluido";
    }
}