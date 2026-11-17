package Banco;

public class Banco {

	private double saldo;
	private String titular;
	
	
	public void Setsaldo(double ingreso) {
		if (ingreso>0) {
			saldo+=ingreso;
		}else {
			throw new IllegalArgumentException("No puedes  depositar una cantidad negativa");
		}
		
		
	}
	
	public void Setretiro(double retiro) {
		if (retiro<=saldo && retiro>0) {
			saldo-=retiro;		}
		else {
			throw new IllegalArgumentException("La cantidad supera el saldo");
		}
	}
	
	
	public double Getsaldo() {
		return saldo;
	}
	
	public void Settitular(String nuevoTitular) {
		titular = nuevoTitular;
	}
	
	public String Gettitular() {
		return titular;
	}
	
	public void detallesCuenta() {
		System.out.println("----------------------DETALLES DE LA CUENTA--------------------------------");
		System.out.println("El nombre del titular es: " + titular);
		System.out.println("Cantidad disponible: " + saldo);
		
	}
	
	
	
}
