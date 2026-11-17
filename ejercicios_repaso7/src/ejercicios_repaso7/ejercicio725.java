package ejercicios_repaso7;

import java.util.Scanner;

public class ejercicio725 {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return Double.NaN; 
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("Elige la operación: 1) Sumar  2) Restar  3) Multiplicar  4) Dividir");
        int opcion = teclado.nextInt();

        double resultado;

        if (opcion == 1) {
            resultado = sumar(num1, num2);
            System.out.println("El resultado es: " + resultado);
        } else if (opcion == 2) {
            resultado = restar(num1, num2);
            System.out.println("El resultado es: " + resultado);
        } else if (opcion == 3) {
            resultado = multiplicar(num1, num2);
            System.out.println("El resultado es: " + resultado);
        } else if (opcion == 4) {
            resultado = dividir(num1, num2);
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("Opción no válida.");
        }

        teclado.close();
    }
}
