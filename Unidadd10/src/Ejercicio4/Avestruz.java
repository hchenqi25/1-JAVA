package Ejercicio4;

public class Avestruz implements IAve.PuedePonerHuevos, IAve.PuedeCantar {

    @Override
    public void ponerHuevos() {
        System.out.println("La avestruz pone un huevo grande.");
    }

    @Override
    public void cantar() {
        System.out.println("La avestruz emite un sonido grave.");
    }
}