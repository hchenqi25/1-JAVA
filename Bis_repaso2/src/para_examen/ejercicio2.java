package para_examen;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = teclado.nextLine();
	System.out.print("Dime tus apellidos: ");
	String apellido = teclado.next();
	
String completo = nombre+apellido;

System.out.print("Tu nombre completo es: " + completo);
teclado.close();
		

	}

}
