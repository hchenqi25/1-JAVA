package TEMA2;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Diem tu nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Dime tus apellidos: ");
		String apellidos = sc.nextLine();
String completo = nombre + apellidos;
		System.out.print("Tu nombre completo es de: " + completo);
sc.close();
	}

}
