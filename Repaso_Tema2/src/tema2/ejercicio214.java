package tema2;
import java.util.Scanner;
public class ejercicio214 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
System.out.print("Dime un numero");
	int num1 = teclado.nextInt();
byte num2 = (byte) num1;
short num3 = (short) num1;
System.out.print("El numero en byte es: " + num2);
System.out.print("El numero en short es: " + num3);
teclado.close();
	}

}
