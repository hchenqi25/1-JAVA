package repaso;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Dime tu nombre: ");
	String nombre = sc.nextLine();
	System.out.print("Dime tus apellidos: ");
	String apellidos = sc.nextLine();
	
	System.out.print("Tu nombre completo es :" + nombre + " " + apellidos);
	sc.close();
	}

}
