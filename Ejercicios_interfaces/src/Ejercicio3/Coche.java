package Ejercicio3;

public class Coche extends Vehiculos {

    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        velocidad += 20;
        System.out.println("El coche acelera. Velocidad actual: " + velocidad);
    }

    @Override
    public void frenar() {
        velocidad -= 10;
        if (velocidad < 0) velocidad = 0;
        System.out.println("El coche frena. Velocidad actual: " + velocidad);
    }
}