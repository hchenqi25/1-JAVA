package TEMA2;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Dime la distancia en metros: ");
		int metros = sc.nextInt();
		double kilometros = (double) metros/1000;
	System.out.printf("2,f/n", kilometros);
sc.close();
	}

}
