package Ejemplo;

public class Puerta {
    protected int ancho;
    protected int alto;
    protected int color;
    protected boolean abierta;

    public void abrir() {
        abierta = true;
    }

    public void cerrar() {
        abierta = false;
    }

    public void setAncho(int nuevoValor) {
        ancho = nuevoValor;
    }

    public void mostrarEstado() {
        System.out.println("Puerta:");
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Color: " + color);
        System.out.println("Abierta: " + abierta);
    }
}