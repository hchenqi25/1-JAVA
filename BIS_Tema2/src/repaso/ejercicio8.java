package repaso;
import java.util.Scanner;
public class ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime una palabra");
		char l1 = teclado.next().charAt(0);
		System.out.print("Dime una palabra");
		char l2 = teclado.next().charAt(0);
		System.out.print("Dime una palabra");
		char l3= teclado.next().charAt(0);
		String palabra = ""+l1+l2+l3;
		System.out.print(palabra);
teclado.close();
	}

}
