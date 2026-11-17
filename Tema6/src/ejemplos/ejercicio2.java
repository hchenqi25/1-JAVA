package ejemplos;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        try {
            System.out.print("Introduce un numero entero: ");
            int numero = Integer.parseInt(sc.nextLine());

            System.out.println("Tabla del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

        } catch (NumberFormatException e) {
            System.out.println("Error debes introducir un número entero valido sin letras ni simbolos.");
        }

        sc.close();
    }
}