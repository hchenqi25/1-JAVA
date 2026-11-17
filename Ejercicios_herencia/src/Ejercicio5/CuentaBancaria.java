package Ejercicio5;

public class CuentaBancaria {

	private double saldo;

	public void depositar(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
		} else {
			throw new IllegalArgumentException("Cantidad inválida");
		}
	}

	public void retirar(double cantidad) {
		if (cantidad > 0 && saldo - cantidad >= 0) {
			saldo -= cantidad;
		} else {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void mostrarSaldo() {
		System.out.println("Saldo actual: " + saldo);
	}
}