package repaso;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime un numero");
		int num1 = teclado.nextInt();
		System.out.print("Dame otro numero: ");
		int num2 = teclado.nextInt();
		
	int total = num1 + num2;
System.out.print("El resultado de la suma es de: " + total);
teclado.close();
	}

}
