package Encapsulacion;

public class Main_CuentaBancaria {

	public static void main(String[] args) {
	CuentaBancaria cb = new CuentaBancaria();
	
	cb.setTitular("Antonio Barba Salvador");
	cb.setSaldo(200);
	
	cb.mostarInfo();
	
	
	cb.depositar(500);
	cb.retirar(1500);

	
	cb.mostarInfo();
	}

}
