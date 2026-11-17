package operaciones;
import java.util.Scanner;
public class Añadir {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int []numeros = new int [5];
		int contador =0;
		
	while (contador<numeros.length) {
		System.out.print("Introduce un numero ( o -1 para salir):");
		int n = teclado.nextInt();
		
		if (n==-1) break;
		numeros[contador] = n;
		contador++;
	}
	System.out.println("Contenido del array:");
	for (int i=0;i<contador;i++) {
		System.out.print(numeros[i]);
		
	}
teclado.close();
	}

}
