package Ejercicio1;

public class Aseo extends habitaciones {

    public Aseo(double largo, double ancho, double alto) {
        super(largo, ancho, alto);
    }

    @Override
    public void calcular() {
        superficie = largo * ancho;
        volumen = largo * ancho * alto;
    }

    @Override
    public void mostrar() {
        System.out.println("Aseo:");
        super.mostrar();
    }
}