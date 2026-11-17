package Biblioteca;
public class Audiolibro extends Publicacion implements IPrestamo {
    private int duracionMinutos;
    private String narrador;

    public Audiolibro(String titulo, String autor, double precio, int duracionMinutos, String narrador) {
        super(titulo, autor, precio);
        this.duracionMinutos = duracionMinutos;
        this.narrador = narrador;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("==============================");
        System.out.println("  AUDIOLIBRO");
        System.out.println("  Titulo    : " + titulo);
        System.out.println("  Autor     : " + autor);
        System.out.println("  Precio    : " + precio + " EUR");
        System.out.println("  Duracion  : " + duracionMinutos + " min");
        System.out.println("  Narrador  : " + narrador);
        System.out.println("==============================");
    }

    @Override
    public void prestar(int dias) {
        System.out.println("[PRESTAMO] Audiolibro \"" + titulo
                + "\" prestado durante " + dias + " dias.");
    }
}