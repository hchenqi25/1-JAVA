package Ejercicio2;

import java.util.Scanner;

public class ARRAY {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la capacidad del array: ");
        int capacidad = teclado.nextInt();
        teclado.nextLine(); 

        Dispositivo[] d = new Dispositivo[capacidad];

    
        for (int i = 0; i < d.length; i++) {

            System.out.println("¿Qué quieres crear? 1- Smartphone  2- Laptop");
            int opcion = teclado.nextInt();
            teclado.nextLine(); 

            if (opcion == 1) {

                Smartphone sm = new Smartphone();

                System.out.println("Introduce el ancho: ");
                sm.setAnchura(teclado.nextInt());

                System.out.println("Introduce el tamaño: ");
                sm.setTamaño(teclado.nextInt());

                System.out.println("Introduce la memoria: ");
                sm.setMemoria(teclado.nextInt());
                teclado.nextLine();

                d[i] = sm;

            } else if (opcion == 2) {

                Laptop p = new Laptop();

                System.out.println("Introduce el ancho: ");
                p.setAnchura(teclado.nextInt());

                System.out.println("Introduce el tamaño: ");
                p.setTamaño(teclado.nextInt());
                teclado.nextLine();

                System.out.println("Introduce el procesador: ");
                p.setProcesador(teclado.nextLine());

                System.out.println("Introduce la memoria RAM: ");
                p.setRAM(teclado.nextInt());
                teclado.nextLine();

                d[i] = p;
            }
        }

      
        System.out.println("------------- MOSTRANDO DISPOSITIVOS -----------------");
        for (int i = 0; i < d.length; i++) {
            d[i].mostrarInfo();
            System.out.println("--------------------------------");
        }

        teclado.close();
    }
}
