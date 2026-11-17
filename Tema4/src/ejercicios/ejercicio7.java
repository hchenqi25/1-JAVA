package ejercicios;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[100];

        System.out.println("Introduce los nombres :");

     
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = teclado.nextLine();

            if (nombres[i].equals(nombres)) {
                break;
            }
        }

        System.out.println("Nombres introducidos:");

       
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null && !nombres[i].isEmpty()) {
                System.out.println("- " + nombres[i]);
            }
        }

        teclado.close();
    }
}
