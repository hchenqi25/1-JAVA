package rep;
import java.util.Scanner;
public class ejercicio7 {

	public static void main(String[] args) {

Scanner teclado = new Scanner (System.in);
System.out.print("Dime una letra");
char  l1 = teclado.next().charAt(0);	
System.out.print("Dime otra letra");
char l2 = teclado.next().charAt(0);
System.out.print("Dime otra letra: ");
char l3 = teclado.next().charAt(0);
System.out.print("Dime otra letra ");
char l4 = teclado.next().charAt(0);
System.out.print("Dime otra letra: ");
char l5 = teclado.next().charAt(0);


String palabra = "" + l1+l2+l3+l4+l5;

System.out.print("La palabra formada es: " + palabra);
	teclado.close();
	
	
	}

}
