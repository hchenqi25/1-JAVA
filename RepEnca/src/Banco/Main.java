package Banco;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		Banco b = new Banco();
		
		System.out.println("Introduzca el nombre del titular de la cuenta: ");
		b.Settitular(teclado.nextLine());
		
	
		
		System.out.println("Introduzca la cantidad a ingresar: ");
		b.Setsaldo(teclado.nextDouble());
		
		System.out.println("Dinero disponible: " + b.Getsaldo());
		
		System.out.println("Introduzca la cantidad a retirar: ");
		b.Setretiro(teclado.nextDouble());
		
		b.detallesCuenta();
	

	teclado.close();}

}
