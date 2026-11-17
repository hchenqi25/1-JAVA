package Ejercicio2;

import java.util.Scanner;

public class GestorDocumentos {

    private Libros[] documentos = new Libros[1000];
    private int contador = 0;

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("                 MENÚ DOCUMENTOS");
            System.out.println("--------------------------------------------------");
            System.out.println("1. Añadir Libro");
            System.out.println("2. Añadir Artículo");
            System.out.println("3. Ver documentos");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    añadirLibro(sc);
                    break;

                case 2:
                    añadirArticulo(sc);
                    break;

                case 3:
                    mostrarDocumentos();
                    break;

                case 4:
                    System.out.println("Saliendo del menú...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 4);
    }

    private void añadirLibro(Scanner sc) {

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Ubicación: ");
        String ubicacion = sc.nextLine();

        System.out.print("Número de páginas: ");
        int paginas = sc.nextInt();
        sc.nextLine();

        Documento d = new Documento();
        d.Settitulo(titulo);
        d.Setautor(autor);
        d.Setubicacion(ubicacion);
        d.setPaginas(paginas);

        documentos[contador] = d;
        contador++;

        System.out.println("Libro guardado correctamente.");
    }

    private void añadirArticulo(Scanner sc) {

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Ubicación: ");
        String ubicacion = sc.nextLine();

        System.out.print("Número de páginas: ");
        int paginas = sc.nextInt();
        sc.nextLine();

        System.out.print("Procedencia: ");
        String proc = sc.nextLine();

        Articulo art = new Articulo(autor, titulo, ubicacion, paginas, proc);

        documentos[contador] = art;
        contador++;

        System.out.println("Artículo guardado correctamente.");
    }

    private void mostrarDocumentos() {
        if (contador == 0) {
            System.out.println("No hay documentos guardados.");
            return;
        }

        for (int i = 0; i < contador; i++) {
            System.out.println("--------------------------------------------------");
            System.out.println("Documento " + (i + 1));
            System.out.println(documentos[i].toString());
        }
    }
}