package Ej2;

public class Desarrollador extends Empleado {
    private int horasExtras;
    private double pagoPorHoraExtra;

    
    public Desarrollador(String nombre, double salarioBase, int id,  int horasExtras, double pagoPorHoraExtra) {
        super(nombre, salarioBase, id);
        this.horasExtras = horasExtras;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }
  
    public Desarrollador() {
        this("Dev Genérico", 1500.0, 2, 10, 20.0);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * pagoPorHoraExtra);
    }
}