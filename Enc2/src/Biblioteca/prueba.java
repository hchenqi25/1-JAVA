package Biblioteca;

import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Libro l = new Libro();

        System.out.print("Dime el título: ");
        l.setTitulo(teclado.nextLine());

        System.out.print("Dime el autor: ");
        l.setAutor(teclado.nextLine());

    
        l.setDisponible(true);

        System.out.println("--- Información inicial ---");
        l.mostrarInfo();

        System.out.println("Intentando prestar el libro...");
        l.prestar();
        l.mostrarInfo();

        System.out.println("Intentando devolver el libro...");
        l.devolver();
        l.mostrarInfo();

        teclado.close();
    }
}