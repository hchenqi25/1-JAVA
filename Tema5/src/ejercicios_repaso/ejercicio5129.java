package ejercicios_repaso;
import java.util.Scanner;
public class ejercicio5129 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime palabra:");
		String palabra = teclado.nextLine();
		
		if (palabra.startsWith("pre") && palabra.endsWith("cion")) {
			System.out.println(palabra);
		}else {
			System.out.print("No empueza ni termina por las palabras");
		}
teclado.close();
	}

}
