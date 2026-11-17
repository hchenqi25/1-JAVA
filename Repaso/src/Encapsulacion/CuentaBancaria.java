package Encapsulacion;

public class CuentaBancaria {
	private double saldo;
	private String titular;

	public void setingresar(double nuevoSaldo) {

		if (nuevoSaldo > 0) {
			System.out.println("Introduce la cantidad a ingresar =>");
			saldo = nuevoSaldo;
		} else {
			throw new IllegalArgumentException("La cantidad a ingresar no es valida");
		}

	}

	public void setRetirar(double cantidad) {
		if (cantidad>0 && saldo>cantidad) {
			System.out.println("Introduce la cantidad a retirar =>");
			saldo -= cantidad;
			System.out.println("Retiro exitoso");

		} else {
			throw new IllegalArgumentException("Fondos insuficientes");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setTitular(String nuevoTitular) {
		System.out.println("Introduce el nombre del titular");
		titular = nuevoTitular;
	}

	public String getTitular() {
		return titular;
	}

	public void MostrarInfo() {
		System.out.println("El titular de la cuenta es => " + titular);
		System.out.println("El saldo restante es de => " + saldo);
	}

}
