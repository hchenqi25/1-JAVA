package Hrencia;

public class CuentaCorriente extends CuentaBancaria {
	public void retirar(double cantidad) {
		if (getSaldo() - cantidad >= -500) {
			setSaldo(getSaldo() - cantidad);
			System.out.println("Retiro exitoso de cuenta corriente: " + cantidad);
		} else {
			System.out.println("Límite de sobregiro alcanzado (-500).");
		}
	}

}
