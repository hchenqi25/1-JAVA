package Encapsulacion;

public class CuentaBancaria {
	private double saldo;
	private String titular;
	
	public void setTitular(String t) {
		titular = t;
		
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setSaldo(double s) {
		if(saldo>=0) {
			saldo = s;
		}else {
			System.out.println("El saldo no puede ser negativo");
			saldo=0;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double cantidad) {
		if(cantidad>0) {
			saldo +=cantidad;
			System.out.println("Deposto realizado con exito." + " Nuevo saldo=>" + saldo);
		}else {
			System.out.println("No se puede introduce una cantidad negativa");
		}
	
	}
	
	public void retirar(double cantidad) {
		if(cantidad>0 && saldo>=cantidad) {
			saldo-=cantidad;
			System.out.println("Cantidad restante => " + saldo);
		}else {
			System.out.println("Error");
		}
	}
	
	
	public void mostarInfo() {
		System.out.println("Titular => " + titular);
		System.out.println("Saldo actual => " + saldo);
	}

}
