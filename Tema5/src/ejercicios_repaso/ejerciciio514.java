package ejercicios_repaso;
import java.util.Scanner;
public class ejerciciio514 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	System.out.print("Dime el nombre del archivo");
		String nombre = teclado.nextLine();
		
		if (nombre.endsWith(".jpg") || nombre.endsWith(".png")) {
			
		}
		System.out.println("Es una imagen");
	teclado.close();	

	}

}
