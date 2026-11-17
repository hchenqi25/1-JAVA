package Ejerciciio3;

public class Circulo extends Figura {

    double radio;

    public Circulo(double r) {
        radio = r;
    }

    
    public double Area() {
        return Math.PI * radio * radio;
    }
}