package CuentaBancaria;

public class CuentaBancaria {

	private String numeroCuenta;
	private double saldo;
	protected String titular;
	String tipoCuenta;

	public void setNumeroCuenta(String nc) {
		numeroCuenta = nc;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setSaldo(double s) {
		if (s > 0) {
			saldo = s;
		} else {
			System.out.println("El saldo no puede ser negativo");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setTitular(String t) {
		titular = t;
	}

	public String getTitular() {
		return titular;
	}

	public void mostrarInfo() {
		System.out.println("Titular => " + titular);
		System.out.println("Numero de cuenta => " + numeroCuenta);
		System.out.println("Saldo => " + saldo);
	}

	public void setTipoCuenta(String tc) {
		tipoCuenta = tc;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void CalcularIntereses() {
		double intereses = saldo * 0.02;
		System.out.println("Saldo despues de aplicar intereses => " + intereses);
	}

}
