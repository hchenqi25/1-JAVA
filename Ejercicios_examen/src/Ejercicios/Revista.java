package Ejercicios;

public class Revista extends Material {
    private int numero;

    public Revista(String id, String titulo, int numero) {
        super(id, titulo);
        this.numero = numero;
    }

    @Override
    public String getTipo() { return "REVISTA"; }

    @Override
    public String serializar() {
        return "REVISTA;" + getId() + ";" + getTitulo() + ";" + numero;
    }

    @Override
    public String toString() {
        return super.toString() + " - Nº: " + numero;
    }
}