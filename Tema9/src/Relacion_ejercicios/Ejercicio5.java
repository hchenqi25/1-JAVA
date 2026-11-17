package Relacion_ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

      
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            lista.add(teclado.nextInt());
        }

       
        ordenarLista(lista);

        System.out.println("Lista ordenada: " + lista);
    }


    public static void ordenarLista(ArrayList<Integer> lista) {
        int n = lista.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                int actual = lista.get(j);
                int siguiente = lista.get(j + 1);

             
                if (actual > siguiente) {
                    lista.remove(j);          
                    lista.add(j, siguiente);  
                    lista.remove(j + 1);     
                    lista.add(j + 1, actual); 
                }
            }
        }
    }
}