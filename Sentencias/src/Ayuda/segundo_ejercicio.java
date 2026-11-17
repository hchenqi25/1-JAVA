package Ayuda;
import java.util.Scanner;
public class segundo_ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
System.out.print("Damee un numero: ");
short num1 = teclado.nextShort();
System.out.print("Dame otro numero: ");
short num2 = teclado.nextShort();
String resultado = (num1 == num2) ? "True" : "False";
System.out.print("Es: " + resultado);
teclado.close();
	}

}
