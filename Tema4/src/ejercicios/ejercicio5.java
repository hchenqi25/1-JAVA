package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numero = new double[10];
        double suma = 0;

    
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numero[i] = teclado.nextDouble();
            suma += numero[i];
        }

        double media = suma / numero.length;
        System.out.println("La media es: " + media);

      
        System.out.println("Números por encima de la media:");
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > media) {
                System.out.println(numero[i]);
            }
        }

        teclado.close();
    }
}

