package ejemplos;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
    	Scanner teclado = new Scanner (System.in);
    System.out.print("Dime una frase:");
    String frase = teclado.nextLine();
    
    for (int i = frase.length()-1;i>=0;i--) {
    	System.out.print(frase.charAt(i));
    }
 teclado.close();       
    }
}
