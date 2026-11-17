package Ejercicios_resueltos;
import java.util.Scanner;
public class ejerciico48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Dime la longitud");
		int longitud = sc.nextInt();
	float[]numeros=new float[longitud];
	for (int i=0;i<=numeros.length;i++) {
		System.out.print("Introduce numeros: ");
		numeros[i]=sc.nextInt();
		
	float suma=0;
	for(i=0;i<numeros.length;i++) {
		suma=suma+numeros[1];
	}
	float media = suma/longitud;
	System.out.print(media);
	sc.close();
	}

	}

}
