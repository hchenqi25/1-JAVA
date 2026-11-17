package Tema1;
import java.util.Scanner;
public class ejercicio211 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	
	System.out.print("Introduce un numero:");
	int num1 = teclado.nextInt();
	
	System.out.print("Introduce un numero: ");
	int num2 = teclado.nextInt();
	
	int suma = num1 + num2;
	
	System.out.print("La suma de los numeros introducidos es de: " + suma);
	

	teclado.close();}

}
