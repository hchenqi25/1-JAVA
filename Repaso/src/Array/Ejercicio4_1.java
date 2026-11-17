package Array;
import java.util.Scanner;
public class Ejercicio4_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[]numeros = new int[4];
		
		for (int i =0; i<4;i++) {
			System.out.println("Introduce un numero =>" );
			numeros[i] =teclado.nextInt();
		}
		
		for (int i =0; i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}

	teclado.close();}

}
