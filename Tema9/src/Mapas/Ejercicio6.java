package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> numeros = new HashMap<>();
        numeros.put("one", "uno");
        numeros.put("two", "dos");
        numeros.put("three", "tres");
        numeros.put("four", "cuatro");
        numeros.put("five", "cinco");

        System.out.print("Introduce un número del 1 al 5 en inglés: ");
        String palabra = sc.nextLine().toLowerCase();

        String traduccion = numeros.get(palabra);

        if (traduccion != null) {
            System.out.println(traduccion);
        } else {
            System.out.println("No reconozco esa palabra.");
        }
   sc.close(); }
}