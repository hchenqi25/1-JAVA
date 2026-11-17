package Ejercicio5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Administrativo("Ana", 1));
        empleados.add(new Tecnico("Luis", 2));
        empleados.add(new Administrativo("Marta", 3));
        empleados.add(new Tecnico("Carlos", 4));

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre() +
                               " | ID: " + e.getId() +
                               " | Salario: " + e.calcularSalario());

           
            e.generarReporte();
            e.realizarMantenimiento();


            System.out.println("----------------------------------");
        }
    }
}