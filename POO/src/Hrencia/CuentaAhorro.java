package Hrencia;

public class CuentaAhorro extends CuentaBancaria {

	
	@Override
	public void retirar(double cantidad) {
		if(getSaldo()-cantidad>100) {
			setSaldo(getSaldo()-cantidad);
		}
	}

}
