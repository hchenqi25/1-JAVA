package Ejercicio5;


public class Administrativo extends Empleado implements Reporte {

    public Administrativo(String nombre, int id) {
        super(nombre, id);
    }

    @Override
    public double calcularSalario() {
        return 1500.0; 
    }

    @Override
    public void generalReporte() {
        System.out.println("Administrativo " + nombre + " está generando un reporte.");
    }
}