package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        MetodoPago tarjeta = new TarjetaCredito("1234-5678-9999-0000");
        MetodoPago paypal = new Paypal("usuario@example.com");
        MetodoPago efectivo = new Efectivo();

        carrito.realizarPago(tarjeta, 50.0);
        carrito.realizarPago(paypal, 20.5);
        carrito.realizarPago(efectivo, 10.0);
    }
}