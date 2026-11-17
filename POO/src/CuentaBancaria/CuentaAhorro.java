package CuentaBancaria;

public class CuentaAhorro extends CuentaBancaria {
	
	private double intereses;
	
	
	public void setIntereses(double i) {
		if(i>=0) {
			intereses =i;
		}
	}
	
	public double getIntereses() {
		return intereses;
	}
	
	public void MostrarInfo() {
		System.out.println("Tipo cuenta => " + getTipoCuenta());
		System.out.println("Interes aplicados a la cuenta = " +  intereses);
	}

}
