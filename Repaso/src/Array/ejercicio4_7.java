package Array;
import java.util.Scanner;
public class ejercicio4_7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long[]numeros = new long[6];
		
		for(int i=0; i<6; i++) {
			System.out.println("Introduce un numero =>");
			numeros[i] = teclado.nextLong();
		}
		
		for(int i= numeros.length -1; i>=0;i--) {
			System.out.println(numeros[i]);
		}

	teclado.close();}

}
