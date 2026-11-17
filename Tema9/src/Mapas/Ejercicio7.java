package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> mapa = new HashMap<>();

        mapa.put("A", "Rojo");
        mapa.put("B", "Azul");
        mapa.put("C", "Verde");
        mapa.put("D", "Amarillo");
        mapa.put("E", "Negro");

        System.out.println("Mapa inicial:");
        System.out.println(mapa);

        mapa.remove("C");

        mapa.replace("D", "Blanco");

        System.out.println("Mapa después de eliminar y reemplazar:");
        System.out.println(mapa);

        while (true) {
            System.out.print("Introduce una clave para buscar (0 para salir): ");
            String clave = sc.nextLine();

            if (clave.equals("0")) {
                break;
            }

            String valor = mapa.get(clave);

            if (valor != null) {
                System.out.println("Valor encontrado: " + valor);
            } else {
                System.out.println("No encontrado");
            }
     }
        sc.close();    }
}