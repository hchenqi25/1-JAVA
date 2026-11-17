package Ejercicio1;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la capacidad del array");
        int capacidad = teclado.nextInt();
        teclado.nextLine(); 

        Vehiculo[] ve = new Vehiculo[capacidad];

        for (int i = 0; i < ve.length; i++) {

            System.out.println("¿Qué quieres crear? 1-Automóvil  2-Camión");
            int opcion = teclado.nextInt();
            

            if (opcion == 1) {
                Automovil av = new Automovil();

                System.out.println("Introduce la marca: ");
                av.setMarca(teclado.nextLine());

                System.out.println("Introduce tipo: ");
                av.setTipo(teclado.nextLine());

                System.out.println("Introduce la potencia: ");
                av.setPotencia(teclado.nextInt());

                System.out.println("Introduce las plazas disponibles: ");
                av.setPlazas(teclado.nextInt());
                teclado.nextLine();

                ve[i] = av; 

            } else if (opcion == 2) {
                Camion ca = new Camion();

                System.out.println("Introduce la marca: ");
                ca.setMarca(teclado.nextLine());

                System.out.println("Introduce tipo: ");
                ca.setTipo(teclado.nextLine());

                System.out.println("Introduce la capacidad: ");
                ca.setCapacidad(teclado.nextInt());

                System.out.println("Introduce las plazas disponibles: ");
                ca.setPlazas(teclado.nextInt());
                teclado.nextLine();

                ve[i] = ca; 
            }
        }

      
        System.out.println("--------------- MOSTRANDO VEHÍCULOS ---------------");
        for (int i = 0; i < ve.length; i++) {
            ve[i].mostrarInfo();
            System.out.println("-----------------------------------");
        }

        teclado.close();
    }
}
