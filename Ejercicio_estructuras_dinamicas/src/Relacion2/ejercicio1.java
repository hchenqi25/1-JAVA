package Relacion2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Map<String, Double> map = new HashMap<>();

        map.put("Aspiradora", 50.19);
        map.put("Oscar", 25.35);
        map.put("Alan", 95.9);
        map.put("Cristian", 35.19);

        System.out.println("1- Aspiradora");
        System.out.println("2- Oscar");
        System.out.println("3- Alan");
        System.out.println("4- Cristian");

        System.out.print("Elige opción: ");

        try {
            int opcion = teclado.nextInt();
            String clave = null;

            switch (opcion) {
                case 1: clave = "Aspiradora"; break;
                case 2: clave = "Oscar"; break;
                case 3: clave = "Alan"; break;
                case 4: clave = "Cristian"; break;
                
            }

            System.out.println("Precio: " + map.get(clave));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        teclado.close();
    }
}