package Ejercicio3;

public class Moto extends Vehiculos {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        velocidad += 50;
        System.out.println("La moto acelera. Velocidad actual: " + velocidad);
    }

    @Override
    public void frenar() {
        velocidad -= 30;
        if (velocidad < 0) velocidad = 0;
        System.out.println("La moto frena. Velocidad actual: " + velocidad);
    }
}