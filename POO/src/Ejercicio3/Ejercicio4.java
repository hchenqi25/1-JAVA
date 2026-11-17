package Ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        String[] palabras = {
                "programacion",
                "computadora",
                "java",
                "desarrollo",
                "teclado",
                "internet",
                "algoritmo"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        try {

            
            String palabraSecreta = palabras[random.nextInt(palabras.length)];

          
            StringBuilder palabraOculta = new StringBuilder();

            for (int i = 0; i < palabraSecreta.length(); i++) {
                palabraOculta.append("_");
            }

            int fallos = 0;
            final int MAX_FALLOS = 6;

            boolean gano = false;

            System.out.println("===== JUEGO DEL AHORCADO =====");

            while (!gano && fallos < MAX_FALLOS) {

        
                System.out.println("\nPalabra: " + palabraOculta);
                System.out.println("Fallos: " + fallos + "/" + MAX_FALLOS);

         
                System.out.print("Introduce una letra: ");
                String entrada = scanner.nextLine().toLowerCase();

               
                if (entrada.isEmpty()) {
                    System.out.println("Debes introducir una letra.");
                    continue;
                }

                if (entrada.length() > 1) {
                    System.out.println("Solo puedes introducir una letra.");
                    continue;
                }

                char letra = entrada.charAt(0);

                if (!Character.isLetter(letra)) {
                    System.out.println("Debes introducir una letra válida.");
                    continue;
                }

                boolean acierto = false;

              
                for (int i = 0; i < palabraSecreta.length(); i++) {

                    if (palabraSecreta.charAt(i) == letra) {

                  
                        palabraOculta.setCharAt(i, letra);

                        acierto = true;
                    }
                }

               
                if (acierto) {
                    System.out.println("¡Correcto!");
                } else {
                    fallos++;
                    System.out.println("Incorrecto.");
                }

             
                if (palabraOculta.toString().equals(palabraSecreta)) {
                    gano = true;
                }
            }

            if (gano) {
                System.out.println("\n¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
            } else {
                System.out.println("\nHas perdido. La palabra era: " + palabraSecreta);
            }

        } catch (Exception e) {

            System.out.println("Ha ocurrido un error.");
            System.out.println("Detalle: " + e.getMessage());

        } finally {

            scanner.close();
        }
    }
}