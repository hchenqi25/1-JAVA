package Hrencia;

public class Main_Banco {

	public static void main(String[] args) {
		CuentaAhorro ahorro = new CuentaAhorro();
		 CuentaCorriente corriente = new CuentaCorriente();
		 ahorro.depositar(500);
		 ahorro.mostrarInfo();
		 ahorro.retirar(450);
		 ahorro.mostrarInfo();
		 corriente.depositar(200);
		 corriente.mostrarInfo();
		 corriente.retirar(600);
		 corriente.mostrarInfo();

	}

}
