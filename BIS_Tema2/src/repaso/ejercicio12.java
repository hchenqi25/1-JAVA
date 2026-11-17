package repaso;
import java.util.Scanner;
public class ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime tu nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Dime tus apellidos: ");
		String apellidos = teclado.nextLine();
System.out.print("Ti correo es: " + nombre+ "." + apellidos +"@ejemplo.com.");
teclado.close();
	}

}
