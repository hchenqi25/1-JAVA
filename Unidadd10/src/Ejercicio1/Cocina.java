package Ejercicio1;

public class Cocina extends habitaciones {

    public Cocina(double largo, double ancho, double alto) {
        super(largo, ancho, alto);
    }

    @Override
    public void calcular() {
        superficie = largo * ancho;
        volumen = largo * ancho * alto;
    }
}