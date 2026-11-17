package Relacion2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> paises = new ArrayList<>();
        paises.add("España");
        paises.add("Francia");
        paises.add("Italia");
        paises.add("Portugal");

        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Buscar un país");
            System.out.println("2. Reemplazar un país");
            System.out.println("3. Eliminar todos los países");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Opción no válida.");
                continue;
            }

            switch (opcion) {
                case 1:
                    buscarPais(paises, sc);
                    break;
                case 2:
                    reemplazarPais(paises, sc);
                    break;
                case 3:
                    eliminarTodos(paises);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }

            System.out.println("Lista actual: " + paises);

        } while (opcion != 4);

        sc.close();
    }

    // Buscar país
    public static void buscarPais(List<String> lista, Scanner sc) {
        System.out.print("Introduce el país a buscar: ");
        String pais = sc.nextLine();

        if (lista.contains(pais)) {
            System.out.println("El país está en la lista.");
        } else {
            System.out.println("El país NO está en la lista.");
        }
    }


    public static void reemplazarPais(List<String> lista, Scanner sc) {
        System.out.print("Introduce el país que quieres reemplazar: ");
        String viejo = sc.nextLine();

        if (!lista.contains(viejo)) {
            System.out.println("Ese país no está en la lista.");
            return;
        }

        System.out.print("Introduce el nuevo país: ");
        String nuevo = sc.nextLine();

        int index = lista.indexOf(viejo);
        lista.set(index, nuevo);

        System.out.println("País reemplazado correctamente.");
    }

  
    public static void eliminarTodos(List<String> lista) {
        lista.clear();
        System.out.println("Todos los países han sido eliminados.");
    }
}