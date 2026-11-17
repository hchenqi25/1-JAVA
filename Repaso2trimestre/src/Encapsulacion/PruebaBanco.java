package Encapsulacion;
import java.util.Scanner;
public class PruebaBanco {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CuentaBancaria cb = new CuentaBancaria();
		System.out.println("Introduce el nombre del titular");
		cb.setTitular(teclado.nextLine());
		System.out.println("Introduce la cantidad a despositar =>");
		cb.setDeposito(teclado.nextDouble());
		System.out.println("Introduce la cantidad a retirar =>");
		cb.setRetirar(teclado.nextDouble());
		
		System.out.println("---------------INFORMACIÓN DE LA CUENTA BANCARIA-----------------");
		cb.MostrarInfo();

teclado.close();	}

}
