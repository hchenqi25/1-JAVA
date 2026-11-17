package rep;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	System.out.print("Dime un numero: ");
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
