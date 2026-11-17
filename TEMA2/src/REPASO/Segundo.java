package REPASO;
import java.util.Scanner;
public class Segundo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String nombre = teclado.next();
		String apellidos = teclado.next();
	
		System.out.println("Tu nombre completo es: " + nombre + " " + apellidos);
teclado.close();
	}

}
