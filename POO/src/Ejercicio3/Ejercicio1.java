package Ejercicio3;

import java.io.*;
import java.util.Stack;

public class Ejercicio1 {

    public static void main(String[] args) {

    
        Stack<String> pila = new Stack<>();

        try (
                BufferedReader br = new BufferedReader(new FileReader("entrada.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"))
        ) {

            String linea;

            while ((linea = br.readLine()) != null) {

                pila.push(linea);
            }

         
            while (!pila.isEmpty()) {

                bw.write(pila.pop());
                bw.newLine();
            }

            System.out.println("Fichero invertido correctamente.");

        } catch (IOException e) {

            System.out.println("Error de lectura o escritura: " + e.getMessage());
        }
    }
}