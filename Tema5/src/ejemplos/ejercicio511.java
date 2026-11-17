package ejemplos;
import java.util.Scanner;
public class ejercicio511 {

	public static void main(String[] args) {
		    
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime una frase:");
		String frase = teclado.nextLine();
		
		StringBuilder frase1 = new StringBuilder(frase);
		//Muestro la frase
		System.out.println("La frase original es:" + frase.toString());
		//Remplazo la a por la o
		for (int i=0;i<frase1.length();i++) {
			 if (frase1.charAt(i) == 'a') {
	                frase1.setCharAt(i, 'o');
			 }
		}
        System.out.println("Frase modificada: " + frase1.toString());
teclado.close();

		
	}

}
