package Array;
import java.util.Scanner;
public class ejercicio_4_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[]numeros = new int[4];
		int suma =0; // Se inicia un contador
		
		for (int i=0; i<4;i++) {
			System.out.println("Introduce un numeros =>");
			numeros[i] = teclado.nextInt();
			suma +=numeros[i]; 
			
		}
		
		double media = suma/numeros.length;
		System.out.println("La media es de: " + media);
		
		teclado.close();}

	}


