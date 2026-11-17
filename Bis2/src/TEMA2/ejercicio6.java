package TEMA2;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Dame un numero: ");
		int i = sc.nextInt();
	i++;
	System.out.println(i);
	i--;
	System.out.println(i);
	i+=5;
	System.out.println(i);
	i*=2;
	System.out.println(i);

	sc.close();

	}

}
