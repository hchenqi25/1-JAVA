package ejemplos;
import java.util.Scanner;
public class ejercicio58 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	System.out.print("Dime una frase: " );
	String frase = teclado.nextLine();
	
	String[] palabras = frase.split(" ");

	System.out.println(("Numero de palabras: " + palabras.length));
	
	teclado.close();

	}

}
