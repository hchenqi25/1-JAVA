package Ej1;

public class Moto extends Vehiculo {
    private int cilindrada;

   
    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public Moto() {
        this("Desconocida", "Genérico", 125);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Moto - Marca: " + marca + ", Modelo: " + modelo + ", Cilindrada: " + cilindrada + "cc");
    }
}