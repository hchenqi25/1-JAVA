package ejercicios_repaso;
import java.util.Scanner;
public class ejercicio523 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Dime una frase:");
		String frase = teclado.nextLine();
		   StringBuilder frase1 = new StringBuilder(frase);
		   frase1.reverse();
		   
		  System.out.print(frase1.toString());
teclado.close();
	}

}
