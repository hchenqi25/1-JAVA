package ejemplos;

import java.util.Scanner;

public class ejercicio512 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime una palabra: ");
        String palabra = teclado.nextLine();

        StringBuilder palabra1 = new StringBuilder(palabra);

        // Muestro la palabra original
        System.out.println("La palabra original es: " + palabra1.toString());

        // Inserto asterisco al principio y al final
        palabra1.insert(0, "*");
        palabra1.append("*");
        System.out.println("La palabra modificada es: " + palabra1.toString());

        // Reemplazo la primera letra por #
        palabra1.setCharAt(0, '#');
        System.out.println("La frase modificada es: " + palabra1.toString());

        // Elimino el carácter en la posición 2
        palabra1.deleteCharAt(2);
        System.out.println("La palabra modificada es: " + palabra1.toString());

        teclado.close();
    }
}