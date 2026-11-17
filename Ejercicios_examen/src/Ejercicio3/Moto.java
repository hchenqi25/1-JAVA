package Ejercicio3;

public class Moto extends auto {
    public Moto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }
    @Override
    public String getTipo() { return "Moto"; }
}