package Ejercicio2;

public class Articulo extends Documento {

    private String procedencia;

    public Articulo(String a, String t, String u, int p, String proc) {
        autor = a;
        titulo = t;
        ubicacion = u;
        paginas = p;
        procedencia = proc;
    }


    public String toString() {
        return "Título: " + titulo +
               ", Autor: " + autor +
               ", Ubicación: " + ubicacion +
               ", Páginas: " + paginas +
               ", Procedencia: " + procedencia;
    }
}