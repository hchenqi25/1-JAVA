package Ejercicio1;

public abstract class habitaciones {
    protected double largo;
    protected double ancho;
    protected double alto;

    protected double superficie;
    protected double volumen;

    public habitaciones(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public abstract  void calcular();

    public void mostrar() {
        System.out.println("Superficie: " + superficie + " m2");
        System.out.println("Volumen: " + volumen + " m3");
    }
}