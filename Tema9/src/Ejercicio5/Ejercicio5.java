package Ejercicio5;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList arrayList = new ArrayList();

		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce una frase: ");
			arrayList.add(sc.nextLine());
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce un numero: ");
			arrayList.add(sc.nextInt());
		}

		int total = arrayList.size();
		for (int i = 0; i < total; i++) {
			System.out.println("La posición " + i + " del arrayList es: " + arrayList.get(i));
		}


		arrayList.add(2, 3.14);

	
		arrayList.remove(4);

		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Ahora, la posición " + i + " del arrayList es: " + arrayList.get(i));
		}
	}
}