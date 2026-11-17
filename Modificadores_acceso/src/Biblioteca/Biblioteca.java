package Biblioteca;

public class Biblioteca {

    int cantidadLibros;  

    public void agregarLibro(Libro libro) {
        cantidadLibros++;
    }

    protected void mostrarCantidadLibros() {
        System.out.println("Cantidad de libros: " + cantidadLibros);
    }
}