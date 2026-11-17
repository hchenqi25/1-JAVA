package Encapsulacion;

import java.util.Scanner;

public class Cuenta_Bancaria2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CuentaBancaria cb = new CuentaBancaria();

		System.out.println("Introduce el nombre del titular");
		cb.setTitular(teclado.nextLine());

	

		System.out.println("Introduce el dinero a ingresar =>");
		cb.setingresar(teclado.nextDouble());

		System.out.println("Introduce el dinero a  rteirar =>");
		cb.setRetirar(teclado.nextDouble());


		cb.MostrarInfo();

		teclado.close();
	}

}
