package Ejercicio1;

public class Vehiculo {
    String marca;

    public Vehiculo() {
        
    }

    public Vehiculo(String m) {
        marca = m;
    }

    public String obtenerDescripcion() {
        return "Vehículo de la marca " + marca;
    }
}