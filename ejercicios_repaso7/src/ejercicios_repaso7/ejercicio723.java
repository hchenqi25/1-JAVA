package ejercicios_repaso7;

import java.util.Scanner;

public class ejercicio723 {

    
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Encantado de conocerte.");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombreUsuario = teclado.nextLine();

     
        saludar(nombreUsuario);

        teclado.close();
    }
}