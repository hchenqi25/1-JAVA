package mohamen;
import java.util.Scanner;
public class ejercicio24 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dime tu nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Dime tu edad:");
		int edad = teclado.nextInt();
		System.out.print("Dime tu peso en kg");
		float peso = teclado.nextFloat();
		
	System.out.print("Hola," + "" + nombre + "." + " " + "Tienes:  " + " " + edad + "" + "años" + " " + "y" +  " "+ "pesas: " + " " + peso);
		

teclado.close();	}

}
