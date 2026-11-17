package ejemplos;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
            System.out.print("Introduce el primer numero: ");
            int num1 = sc.nextInt();

            System.out.print("Introduce el segundo numero: ");
            int num2 = sc.nextInt();

            int suma = num1 + num2;
            System.out.println("La suma es: " + suma);

        } catch (InputMismatchException e) {
            System.out.println("Error debes introducir numeros enteros");
        } finally {
            System.out.println("Operacion completada.");
            sc.close();
        }


	}

}
