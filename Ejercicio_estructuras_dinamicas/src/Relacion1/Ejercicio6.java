package Relacion1;

import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(2);

        int suma = 0;

        for (int n : numeros) {
            suma += n;
        }

        System.out.println("Suma = " + suma);
    }
}