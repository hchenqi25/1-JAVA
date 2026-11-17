package repaso;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int i = teclado.nextInt();
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		i+=5;
		System.out.println(i);
		i*=2;
		System.out.println(i);
		teclado.close();

	}

}
