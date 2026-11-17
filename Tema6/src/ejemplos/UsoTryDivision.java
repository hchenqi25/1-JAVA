package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsoTryDivision {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce el primer número (double): ");
            double num1 = teclado.nextDouble();

            System.out.print("Introduce el segundo número (double): ");
            double num2 = teclado.nextDouble();

            double resultado = num1 / num2;
            System.out.println("Resultado de la división: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir un número válido (usa coma o punto decimal).");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado: " );
        } finally {
            teclado.close();
            System.out.println("Programa finalizado.");
        }
    }
}