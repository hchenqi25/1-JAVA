package ejemplos;
import java.util.Scanner;
public class ejercicio611 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int numero = 0;
	 boolean valido = false;
	 while (!valido) {
	 try {
	 System.out.print("Dime un numero: ");
	 numero = teclado.nextInt();
	 System.out.print("Dime otro numero");
	 int num2 = teclado.nextInt();
	 int division = numero/ num2;
	 System.out.print(division);
	 valido = true; 
	 } catch (ArithmeticException e) {
	 System.out.println("Error: Debes introducir un número válido."); 

 }
}
	teclado.close(); 
	}
}
	 
	