package operaciones;
import java.util.Scanner;
public class Insertar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int[]numeros = new int[6];
		int []originales = {10,20,30,40,50};
		int elementos =5;
		
	//Copiamos los originales al nuevo arryse
		for (int i =0;i<elementos;i++) {
			numeros[i]=originales[i];
		}
			System.out.print("Introduce el numero a insertar: ");
			int nuevo = teclado.nextInt();
			
			System.out.print("Introduce la posición(0 a5):");
			int pos = teclado.nextInt();
		if (pos<0 || pos>elementos) {
			System.out.print("Posicion invalida.");
		}else {
			for (int i =elementos ;i>pos;i--) {
				numeros[i] = numeros[i-1];
			}
		numeros[pos] = nuevo;
		elementos++;
		
	System.out.println("Array despues de insertar:");
	for (int i=0;i<elementos;i++) {
		System.out.print(numeros[i]);
	}
		
	teclado.close();	}

	}

}
