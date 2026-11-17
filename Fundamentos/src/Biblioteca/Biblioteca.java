package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public void añadirPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
        System.out.println("Añadida: \"" + publicacion.getTitulo() + "\"");
    }

    public void mostrarPublicaciones() {
        System.out.println("\n========================================");
        System.out.println("  CATALOGO COMPLETO DE PUBLICACIONES");
        System.out.println("========================================");
        if (publicaciones.isEmpty()) {
            System.out.println("  (La biblioteca esta vacia)");
            return;
        }
        for (Publicacion p : publicaciones) {
            p.mostrarInformacion();
        }
    }

    public void mostrarPublicacionesPrestables() {
        System.out.println("\n========================================");
        System.out.println("  PUBLICACIONES PRESTABLES");
        System.out.println("========================================");
        boolean hayPrestables = false;
        for (Publicacion p : publicaciones) {
            if (p instanceof IPrestamo) {
                p.mostrarInformacion();
                hayPrestables = true;
            }
        }
        if (!hayPrestables) {
            System.out.println("  (No hay publicaciones prestables)");
        }
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }
}