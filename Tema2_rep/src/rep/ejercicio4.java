package rep;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime un numero: ");
		int num = teclado.nextInt();
		byte num2 = (byte) num;
		short num3 = (short) num;
		
	System.out.print("El numero en byte es: " + num2);
	System.out.print("El numero en short es : " + num3);
	teclado.close();

	}

}
