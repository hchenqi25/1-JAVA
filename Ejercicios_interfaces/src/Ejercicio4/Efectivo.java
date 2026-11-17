package Ejercicio4;

public class Efectivo implements MetodoPago {

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + "€ en efectivo.");
    }
}