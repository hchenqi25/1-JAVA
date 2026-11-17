package Ejercicio5;

public class Tecnico extends Empleado implements Mantenible {

    public Tecnico(String nombre, int id) {
        super(nombre, id);
    }

    @Override
    public double calcularSalario() {
        return 29000; 
    }

    @Override
    public void RealizarMantenimiento() {
        System.out.println("Técnico " + nombre + " está realizando mantenimiento.");
    }
}