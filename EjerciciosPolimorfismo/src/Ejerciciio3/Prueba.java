package Ejerciciio3;

public class Prueba {
    public static void main(String[] args) {

        Cuadrado c = new Cuadrado(5);
        Rectangulo r = new Rectangulo(5, 6);
        Circulo ci = new Circulo(5);

        System.out.println("Área del Cuadrado: " + c.Area());
        System.out.println("Área del Rectángulo: " + r.Area());
        System.out.println("Área del Círculo: " + (ci.Area() * 10) / 10.0);
        System.out.println("Área del Rectángulo con factor 2: " + r.Area(2));
    }
}