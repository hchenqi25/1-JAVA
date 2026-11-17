package Array;
import java.util.Scanner;
public class ejercicio4_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float[]numeros = new float[5];
		
		for(int i=0; i<5;i++) {
			System.out.println("Introduce un numeros =>");
			numeros[i]=teclado.nextFloat();
		}
		for(int i=numeros.length -1;i>=0;i--) {
			System.out.println(numeros[i]);
		}

	teclado.close();}

}
