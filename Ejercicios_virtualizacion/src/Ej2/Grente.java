package Ej2;

public class Grente extends Empleado {
    private double bonoGerencial;

    public Grente(String nombre, double salarioBase, int id, double bonoGerencial) {
        super(nombre, salarioBase, id);
        this.bonoGerencial = bonoGerencial;
    }

   
    public Grente() {
        this("Gerente Genérico", 2000.0, 1, 500.0);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonoGerencial;
    }
}