package tema2;
import java.util.Scanner;
public class ejercicio222 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.print("Dime tu nombre: ");
	String nombre = teclado.next();
	System.out.print("Dime tus apellidos: ");
	String apellidos = teclado.next();
String correo = nombre +"."+ apellidos + "@ejemplo.com";
System.out.print("Tu correo electronico es: " + correo);
teclado.close();

	}

}
