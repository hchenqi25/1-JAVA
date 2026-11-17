package Ejercicio5;

public class CuentaCorriente extends CuentaBancaria {
	
	    public void retirar(double cantidad) {
	        double saldoActual = getSaldo();

	        if (cantidad > 0 && saldoActual - cantidad >= -500) {
	            depositar(-cantidad);
	        } else {
	            throw new IllegalArgumentException("Límite de sobregiro (-500€) alcanzado");
	        }
	    }
	}


