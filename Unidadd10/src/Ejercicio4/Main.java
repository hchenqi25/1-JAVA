package Ejercicio4;

public class Main {
    public static void main(String[] args) {

        IAve.PuedePonerHuevos aveHuevos = new Avestruz();
        IAve.PuedeCantar aveCanto = new Avestruz();

        aveHuevos.ponerHuevos();
        aveCanto.cantar();
    }
}