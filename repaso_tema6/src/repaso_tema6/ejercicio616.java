package repaso_tema6;

import java.util.Scanner;

public class ejercicio616 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Dime un número: ");
            int num1 = teclado.nextInt();

            System.out.print("Dime otro número: ");
            int num2 = teclado.nextInt();

            int division = num1 / num2;
            System.out.println("El resultado de la división es: " + division);

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error:");
            System.out.println("Tipo de excepción: " + e.getClass().getSimpleName());
            System.out.println("Mensaje: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}