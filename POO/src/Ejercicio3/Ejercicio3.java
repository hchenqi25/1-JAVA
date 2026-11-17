package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    static Scanner scanner = new Scanner(System.in);

    
    static String[] alumnos = new String[10];

   
    static int totalAlumnos = 0;

    public static void main(String[] args) {

        int opcion;

        do {

            mostrarMenu();

            try {

                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {

                    case 1:
                        añadirAlumno();
                        break;

                    case 2:
                        insertarAlumno();
                        break;

                    case 3:
                        borrarAlumno();
                        break;

                    case 4:
                        mostrarAlumnos();
                        break;

                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (NumberFormatException e) {

                System.out.println("Debes introducir un número válido.");
                opcion = 0;

            } catch (Exception e) {

                System.out.println("Error: " + e.getMessage());
                opcion = 0;
            }

        } while (opcion != 5);

        scanner.close();
    }


    public static void mostrarMenu() {

        System.out.println("\n===== MENÚ =====");
        System.out.println("1. Añadir alumno");
        System.out.println("2. Insertar alumno");
        System.out.println("3. Borrar alumno");
        System.out.println("4. Mostrar alumnos");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

   
    public static void añadirAlumno() {

        if (totalAlumnos >= alumnos.length) {

            System.out.println("El array está lleno.");
            return;
        }

        System.out.print("Introduce el nombre del alumno: ");
        String nombre = scanner.nextLine();

        alumnos[totalAlumnos] = nombre;
        totalAlumnos++;

        System.out.println("Alumno añadido correctamente.");
    }

    // 
    public static void insertarAlumno() {

        try {

            if (totalAlumnos >= alumnos.length) {

                System.out.println("El array está lleno.");
                return;
            }

            System.out.print("Introduce el nombre del alumno: ");
            String nombre = scanner.nextLine();

            System.out.print("Introduce la posición: ");
            int posicion = Integer.parseInt(scanner.nextLine());

            if (posicion < 0 || posicion > totalAlumnos) {

                System.out.println("Posición no válida.");
                return;
            }

           
            for (int i = totalAlumnos; i > posicion; i--) {

                alumnos[i] = alumnos[i - 1];
            }

            alumnos[posicion] = nombre;
            totalAlumnos++;

            System.out.println("Alumno insertado correctamente.");

        } catch (NumberFormatException e) {

            System.out.println("Debes introducir un número válido.");
        }
    }


    public static void borrarAlumno() {

        try {

            System.out.print("Introduce la posición a borrar: ");
            int posicion = Integer.parseInt(scanner.nextLine());

            if (posicion < 0 || posicion >= totalAlumnos) {

                System.out.println("Posición no válida.");
                return;
            }

         
            for (int i = posicion; i < totalAlumnos - 1; i++) {

                alumnos[i] = alumnos[i + 1];
            }

            alumnos[totalAlumnos - 1] = null;
            totalAlumnos--;

            System.out.println("Alumno borrado correctamente.");

        } catch (NumberFormatException e) {

            System.out.println("Debes introducir un número válido.");
        }
    }

   
    public static void mostrarAlumnos() {

        if (totalAlumnos == 0) {

            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.println("\n===== LISTA DE ALUMNOS =====");

        for (int i = 0; i < totalAlumnos; i++) {

            System.out.println(i + ". " + alumnos[i]);
        }
    }
}