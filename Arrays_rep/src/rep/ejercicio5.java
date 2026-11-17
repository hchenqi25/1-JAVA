package rep;
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float[]numeros = new float [5];
		
		for (int i=0; i<numeros.length;i++) { //Declaro el array
			System.out.print("Introduce un numero" + (i+1) + ":");
			numeros[i] = teclado.nextFloat();
		}
  for (int i =0; i<numeros.length;i++) {
	  System.out.print(numeros[i]);
  }
  teclado.close();
	}

}
