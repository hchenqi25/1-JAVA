package CuentaBancaria;

public class Banco {
	int totalDeCuentas;
	
	public void agregarCuenta(CuentaBancaria cuenta) {
		totalDeCuentas++;
		System.out.println("Cuenta agrgada con exito....");
	}
	protected  void mostrarTotalDeCuentas() {
		System.out.println("Total de cuentas => " + totalDeCuentas);
	}

}
