package Encapsulacion;

public class CuentaBancaria {
private double saldo;
private String titular;


public void setDeposito(double nuevoDeposito) {
	if(nuevoDeposito>0) {
		saldo += nuevoDeposito;
	}else {
		throw new IllegalArgumentException("No puedes introducir dinero negativo");
	}
}
public void setRetirar(double nuevoretiro) {
	if (saldo>0 && saldo>nuevoretiro) {
		saldo-=nuevoretiro;
	}else {
		throw new IllegalArgumentException("ERROR");
	}
	
}
public double getSaldo() {
	return saldo;
}

public void setTitular(String nuevoTitular) {
	titular = nuevoTitular;
}
public String getTitular() {
	return titular;
}

public void MostrarInfo() {
	System.out.println("El tiular es =>" + titular);
	System.out.println("El saldo actual es =>" + saldo);
}
}
