package Ejercicio5;

public class Cuenta_ahorro extends CuentaBancaria {

  
    public void retirar(double cantidad) {
        double saldoActual = getSaldo();

        if (cantidad > 0 && saldoActual - cantidad > 100) {
           
            depositar(-cantidad);
        } else {
            throw new IllegalArgumentException("No puedes retirar: deben quedar más de 100€");
        }
    }
}
