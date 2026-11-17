package Ej1;

public class Cohe extends Vehiculo {
    private int puertas;

 
    public Cohe(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }


    public Cohe() {
        this("Desconocida", "Genérico", 4);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Coche - Marca: " + marca + ", Modelo: " + modelo + ", Puertas: " + puertas);
    }
}