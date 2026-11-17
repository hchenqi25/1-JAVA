package Ejercicio6;

public abstract class CuentaBancaria {
    protected String titular;
    protected double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: el monto a depositar debe ser positivo.");
            return;
        }
        saldo += cantidad;
        System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: el monto a retirar debe ser positivo.");
            return;
        }
        if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente.");
            return;
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }

    public double consultarSaldo() {
        return saldo;
    }
}