package Ejercicio1;

public class Bicicleta extends Vehiculo {

    String marcaBici;

    public Bicicleta(String m) {
        marcaBici = m;
    }


    public String obtenerDescripcion() {
        return "Bicicleta de la marca " + marcaBici + " con 21 cambios";
    }
}
