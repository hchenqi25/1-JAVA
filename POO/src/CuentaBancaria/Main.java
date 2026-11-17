package CuentaBancaria;

public class Main {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria();
		 cuenta1.setNumeroCuenta("123456789");
		 cuenta1.setSaldo(1000.0);
		 cuenta1.setTitular("Juan Pérez");
		 cuenta1.setTipoCuenta("Corriente");
		 CuentaAhorro cuentaAhorro1 = new CuentaAhorro();
		 cuentaAhorro1.setNumeroCuenta("987654321");
		 cuentaAhorro1.setSaldo(5000.0);
		 cuentaAhorro1.setTitular("María Gómez");
		 cuentaAhorro1.setTipoCuenta("Ahorro");
		 cuentaAhorro1.setIntereses(3.0);
		 cuenta1.mostrarInfo();
		 cuentaAhorro1.mostrarInfo();
		 Banco banco = new Banco();
		 banco.agregarCuenta(cuenta1);
		 banco.agregarCuenta(cuentaAhorro1);
		 banco.mostrarTotalDeCuentas();


	}

}
