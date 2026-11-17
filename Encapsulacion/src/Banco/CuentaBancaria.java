package Banco;

public class CuentaBancaria {

	private double saldo;
	private String titular;

	public void setdepositar(double cantidad) {
		if (cantidad>0) {
			saldo+=cantidad;
			System.out.println("La cantidad depositada es de: " + cantidad) ;
		}else {
			throw new IllegalArgumentException("La cantidad no puede ser negativa");
			
		}
	}

	
	
	public void setretirar(double cantidad) {
		if (saldo>=cantidad && cantidad>0) {
			saldo-=cantidad;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}


 public  void setTitular(String nuevoTitular) {
	 titular = nuevoTitular;
 }
 
 
 public String getTitular() {
	 return titular;
 }


public void detalles() {
	System.out.println("El saldo de la cuenta es: " + saldo);
	System.out.println("El nombre del titular es: " + titular );
}



}




