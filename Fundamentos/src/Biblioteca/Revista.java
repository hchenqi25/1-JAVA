package Biblioteca;

public class Revista extends Publicacion {
    private int numeroEdicion;

    public Revista(String titulo, String autor, double precio, int numeroEdicion) {
        super(titulo, autor, precio);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("==============================");
        System.out.println("  REVISTA");
        System.out.println("  Titulo   : " + titulo);
        System.out.println("  Autor    : " + autor);
        System.out.println("  Precio   : " + precio + " EUR");
        System.out.println("  Edicion  : " + numeroEdicion);
        System.out.println("==============================");
    }
}