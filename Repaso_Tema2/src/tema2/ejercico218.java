package tema2;
import java.util.Scanner;
public class ejercico218 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	System.out.print("Dime la temperatura en celsius: ");
	float c = teclado.nextFloat();
	float f = (c*9/5) + 32;
System.out.print("La temepratura es de: " + f);
teclado.close();

	}

}
