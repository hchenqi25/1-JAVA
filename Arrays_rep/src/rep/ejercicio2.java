package rep;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float[]numeros = new float [5];
	System.out.println("Introduce un numero: ");
	 numeros[0] = teclado.nextFloat();
	
	System.out.println("Introduce un numero: ");
	 numeros[1] = teclado.nextFloat();
	
	System.out.println("Introduce un numero: ");
	 numeros[2]= teclado.nextFloat();
	
	System.out.println("Introduce un numero");
	 numeros[3] = teclado.nextFloat();
	
	System.out.print("Introduce un numero: ");
	 numeros[4] = teclado.nextFloat();
	
	
	System.out.println(numeros[4]);
	System.out.println(numeros[3]);
	System.out.println(numeros[2]);
	System.out.println(numeros[1]);
	System.out.println(numeros[0]);
	teclado.close();

	}

}
