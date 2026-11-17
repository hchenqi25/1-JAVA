package Ejercicio3_2;

public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected int cilindrada;
    protected double potencia;
    protected int cantidaddeRuedas;
    protected double velocidad;
    protected double circular;

    public Vehiculo() {
        System.out.println("Entrando en el constructor de Vehiculo");
        cantidaddeRuedas = 4;
    }

    public Vehiculo(int v, int c) {
        System.out.println("Entrando en el constructor de Vehiculo (con parámetros)");
        velocidad = v;
        circular = c;
    }
}