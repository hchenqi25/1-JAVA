package ejemplos;
import java.util.Scanner;
public class eliminar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] numeros = new int[5];
	int contador = 0;
	int num;
	do {
		System.out.println("Introduce un numero:");
		num = sc.nextInt();
		if (num==0) break;
		numeros [contador] = num;
		contador++;
	} while (num!=0); //Salida del bucle 
	for (int i = 0; i<contador;i++);//Llega hasta el numero de posiciones declaradas en el arrays
	System.out.print(numeros);
	sc.close();
	}

}
