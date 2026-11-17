package rep;
import java.util.Scanner;
public class ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime una palabra ");
		String palabra = teclado.nextLine();
		
		System.out.print("Dime una palabra");
		String palabra1 = teclado.nextLine();
		
		System.out.print("Dime otra palabra: ");
		String palabra2 = teclado.nextLine();
		
		System.out.print("Dime otra palabra: ");
		String palabra3 = teclado.nextLine();
		
		System.out.print("Dime otra palabra: ");
		String palabra4 = teclado.nextLine();
		
		System.out.print("Dime otra palabra: ");
		String palabra5 = teclado.nextLine();
		
		
	String frase = palabra+palabra1+palabra2+palabra3+palabra4+palabra5;
	
	System.out.print("La frase formada por las 5 palabras es:" + frase);
	teclado.close();

	}

}
