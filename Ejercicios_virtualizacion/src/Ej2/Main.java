package Ej2;

public class Main {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[4];

        empleados[0] = new Grente("Laura", 2500, 101, 800);
        empleados[1] = new Desarrollador("Carlos", 1800, 202, 15, 25);
        empleados[2] = new Grente();          
        empleados[3] = new Desarrollador();    

        for (Empleado e : empleados) {
            e.mostrarInfo();
        }
    }
}