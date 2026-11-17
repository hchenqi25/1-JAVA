package Ejercicio4;

public class Carrito {

    public void realizarPago(MetodoPago metodo, double monto) {
        System.out.println("Procesando pago...");
        metodo.pagar(monto);
        System.out.println("Pago completado.\n");
    }
}