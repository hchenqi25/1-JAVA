package Relacion_ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            lista.add(teclado.nextInt());
        }

        int suma = 0;

        
        for (int numero : lista) {
            suma += numero;
        }

        System.out.println("La suma de todos los elementos es: " + suma);
  teclado.close();  }
}