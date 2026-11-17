package rep;
import java.util.Scanner;
public class ejericio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Dime la temperatura en Celsius");
		double celsius = teclado.nextDouble();
		
	double farenhight = (celsius*9/5)+32;
	
	System.out.printf("%.2f\n", farenhight);
	teclado.close();

	}

}
