package Biblioteca;

public class LibroFisico extends Publicacion implements IPrestamo {
	private int numeroPaginas;
	private String genero;

	public LibroFisico(String titulo, String autor, double precio, int numeroPaginas, String genero) {
		super(titulo, autor, precio);
		this.numeroPaginas = numeroPaginas;
		this.genero = genero;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("==============================");
		System.out.println("  LIBRO FISICO");
		System.out.println("  Titulo   : " + titulo);
		System.out.println("  Autor    : " + autor);
		System.out.println("  Precio   : " + precio + " EUR");
		System.out.println("  Paginas  : " + numeroPaginas);
		System.out.println("  Genero   : " + genero);
		System.out.println("==============================");
	}

	@Override
	public void prestar(int dias) {
		System.out.println("[PRESTAMO] LibroFisico \"" + titulo + "\" prestado durante " + dias + " dias.");
	}
}