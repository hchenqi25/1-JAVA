package ejercicios_repaso;

import java.util.Scanner;

public class ejercicio516 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime una frase: ");
        String frase = teclado.nextLine();

        StringBuilder frase1 = new StringBuilder(frase);

        int longitud = frase1.length();
        int posicion;

        if (longitud % 2 == 0) {
           
            posicion = (longitud / 2) - 1;
        } else {
         
            posicion = longitud / 2;
        }

        frase1.setCharAt(posicion, '*');

        System.out.println("Frase modificada: " + frase1.toString());
   teclado.close(); }
}