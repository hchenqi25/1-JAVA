package ejercicios_repaso;
import java.util.Scanner;
public class ejercicio517 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Dime una frase:");
		String frase = teclado.nextLine();
		 
		StringBuilder frase1 = new StringBuilder(frase);
		//Muetsro la frase original 
		System.out.println(frase1.toString());
		
		//Utilizo el reverse
		
		frase1.reverse();
		System.out.println(frase1.toString());
	teclado.close();}

}
