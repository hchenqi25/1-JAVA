package Ejemplo;

public class Porton extends Puerta {
    boolean bloqueada;

    public void bloquear() {
        bloqueada = true;
    }

    public void desbloquear() {
        bloqueada = false;
    }

  
    public void mostrarEstado() {
        System.out.println("Portón:");
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Color: " + color);
        System.out.println("Abierta: " + abierta);
        System.out.println("Bloqueada: " + bloqueada);
    }
}