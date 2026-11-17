package operaciones;
import java.util.Scanner;
public class ejercicio415 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float[]notas = new float[4];
	float suma =0;
		for (int i=0;i<notas.length;i++) { 
		System.out.println("Introduce las notas " +(i+1) +":") ;
		notas[i] = teclado.nextFloat();
	}
		for (float  n:notas) {
			suma += n;
		}
   System.out.print(suma);
	teclado.close();	}
	}


