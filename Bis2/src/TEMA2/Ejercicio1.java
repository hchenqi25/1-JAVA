package TEMA2;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.print("Dame un numero");
	int num1 = teclado.nextInt();
	System.out.print("Dame otro numero: ");
	int num2 = teclado.nextInt();
int total = num1 + num2;
System.out.print("La suma de los dos numeros es de:" + total);
teclado.close();
	}

}
