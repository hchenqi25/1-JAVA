package ejercicios_repaso;
import java.util.Scanner;
public class ejercicio520 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String primeras = "";
		String ultimas = "";

		System.out.print("Dime una frase:" );
		String frase = teclado.nextLine();
		for (int i = 0; i < 4 && i < frase.length(); i++) {
		    primeras += frase.charAt(i);
		}
		for (int i = frase.length() - 3; i < frase.length(); i++) {
		    if (i >= 0) {
		        ultimas += frase.charAt(i);
		    }
		}

		System.out.println("Primeras: " + primeras);
		System.out.println("Últimas: " + ultimas);

teclado.close();	}

}
