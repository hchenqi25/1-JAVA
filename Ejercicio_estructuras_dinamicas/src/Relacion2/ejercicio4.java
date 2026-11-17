package Relacion2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<String> palabras = new ArrayList<String>();

        for(int i = 0; i < 3; i++) {
            System.out.println("Introduce una palabra: ");
            palabras.add(teclado.nextLine());
        }

        System.out.println("Lista original: " + palabras);

        System.out.println("¿Qué palabra quieres eliminar?");
        String eliminar = teclado.nextLine();

        if (palabras.remove(eliminar)) {
            System.out.println("La palabra '" + eliminar + "' ha sido eliminada.");
        } else {
            System.out.println("La palabra '" + eliminar + "' no estaba en la lista.");
        }

        for (int i = 0; i < palabras.size() - 1; i++) {
            for (int j = 0; j < palabras.size() - 1 - i; j++) {
                if (esMayor(palabras.get(j), palabras.get(j + 1))) {
                    String aux = palabras.get(j);
                    palabras.set(j, palabras.get(j + 1));
                    palabras.set(j + 1, aux);
                }
            }
        }

        System.out.println("Lista ordenada: " + palabras);

        teclado.close();
    }

    public static boolean esMayor(String a, String b) {
        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            if (a.charAt(i) > b.charAt(i)) {
                return true;
            } else if (a.charAt(i) < b.charAt(i)) {
                return false;
            }
        }

     
        return a.length() > b.length();
    }
}