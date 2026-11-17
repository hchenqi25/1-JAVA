package Hrencia;

public class CuentaBancaria {
	
	private double saldo;
	
	public void setSaldo(double s) {
		saldo =s;
	}
	
	public double getSaldo() {
		return saldo;
		
	}
	
	
	public void depositar(double cantidad) {
		if(cantidad>=0) {
			saldo+=cantidad;
		}else {
			System.out.println("No se puede introducir una cantidad negativa");
		}
	}
	
	public void retirar(double cantidad) {
		if(cantidad>0 && saldo >= cantidad) {
			saldo-=cantidad;
		}else {
			System.out.println("Cantidad no permitida");
		}
	}
	
	public void  mostrarInfo() {
		System.out.println("Saldo de la cuenta => " + saldo);
		
	}

}
