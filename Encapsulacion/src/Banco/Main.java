package Banco;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		CuentaBancaria cb = new CuentaBancaria();
		
		System.out.println("Introduzca el nombre del Titular de la cuenta: ");
		cb.setTitular(teclado.nextLine());		
		
		
		cb.getSaldo();
		System.out.println("Dime la cantidad que desea depositar: ");
		cb.setdepositar(teclado.nextDouble());
		
		System.out.println("Saldo disponible: " + cb.getSaldo());
		
		
		System.out.print("Cantidad a retirar: ");
		cb.setretirar(teclado.nextDouble());
		System.out.println("Saldo actual: " + cb.getSaldo());
		
		cb.detalles();
	

teclado.close();	}

}
