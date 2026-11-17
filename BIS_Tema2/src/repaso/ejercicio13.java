package repaso;
import java.util.Scanner;
public class ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime la base: ");
		float base = teclado.nextFloat();
		System.out.print("Dime la altura: ");
		float altura = teclado.nextFloat();
		
		double area = (double) base*altura;
		System.out.print("El area es: " + area);
		teclado.close();

	}

}
