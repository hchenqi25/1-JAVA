package Biblioteca;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        System.out.println("AÑADIENDO PUBLICACIONES A LA BIBLIOTECA...\n");

   
        biblioteca.añadirPublicacion(new LibroFisico(
                "Cien anos de soledad", "Gabriel Garcia Marquez", 18.50, 432, "Realismo magico"));
        biblioteca.añadirPublicacion(new LibroFisico(
                "El nombre de la rosa", "Umberto Eco", 15.00, 560, "Novela historica"));
        biblioteca.añadirPublicacion(new LibroFisico(
                "1984", "George Orwell", 12.95, 328, "Distopia"));

       
        biblioteca.añadirPublicacion(new Audiolibro(
                "Sapiens", "Yuval Noah Harari", 22.00, 870, "Carlos Ponce"));
        biblioteca.añadirPublicacion(new Audiolibro(
                "El Principito", "Antoine de Saint-Exupery", 9.99, 120, "Ana Milan"));

   
        biblioteca.añadirPublicacion(new Revista(
                "National Geographic", "Varios autores", 5.95, 312));
        biblioteca.añadirPublicacion(new Revista(
                "Scientific American", "Varios autores", 6.50, 89));

     
        biblioteca.mostrarPublicaciones();

     
        biblioteca.mostrarPublicacionesPrestables();

        System.out.println("\n========================================");
        System.out.println("  REALIZANDO PRESTAMOS");
        System.out.println("========================================");
        for (Publicacion p : biblioteca.getPublicaciones()) {
            if (p instanceof IPrestamo) {
                ((IPrestamo) p).prestar(14);
            }
        }

        System.out.println("\nGestion completada correctamente.");
    }
}