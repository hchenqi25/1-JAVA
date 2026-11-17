package banco;

public class Banco {
	private double saldo;
	private String titular;

	public void setSaldo(double ingreso) {
		if (ingreso > 0) {
			saldo += ingreso;
		} else {
			throw new IllegalArgumentException("No se puede introducir una cantidad negativa");
		}
	}

	public void setRetiro(double retiro) {
		if (saldo > retiro && retiro > 0) {
			saldo -= retiro;
		} else {
			throw new IllegalArgumentException("Fondos insuficientes");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setTitular(String nuevoTitular) {
		titular = nuevoTitular;
	}

	public String getTitular() {
		return titular;
	}
	
	
	public void detalles() {
		System.out.println("----------------------DETALLES DE LA CUENTA BANCARIA-------------------------");
		System.out.println("Nombre del titular actual de la cuenta: " + titular);
		System.out.println("Saldo actual: " + saldo);
	
		
	
	
	
	}

}
