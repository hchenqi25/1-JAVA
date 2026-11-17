package rep;
import java.util.Scanner;
public class ejerecicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Dime tu nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Dime tus apellidos:");
		String apellidos = sc.nextLine();
		
		
		System.out.print("El nombre completo es de: " + nombre +" " + apellidos);
sc.close();
	}

}
