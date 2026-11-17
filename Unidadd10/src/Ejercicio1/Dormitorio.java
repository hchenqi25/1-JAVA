package Ejercicio1;

public class Dormitorio extends habitaciones {

    public Dormitorio(double largo, double ancho, double alto) {
        super(largo, ancho, alto);
    }

    @Override
    public void calcular() {
        superficie = largo * ancho;
        volumen = largo * ancho * alto;
    }

    @Override
    public void mostrar() {
        System.out.println("Dormitorio:");
        super.mostrar();
    }
}