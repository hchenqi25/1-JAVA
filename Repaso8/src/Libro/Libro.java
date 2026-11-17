package Libro;

public class Libro {
	private String autor;
	private String titulo;
	private String ubicacion;

	public Libro() {
		autor = "Platon";
		titulo = "El mito de la  caverna";
		ubicacion = "Gercia";
	}

	public String getAutor() {
		return autor;

	}

	public void Setautor(String nuevoAutor) {
		autor = nuevoAutor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void Settitulo(String nuevotitulo) {
		titulo = nuevotitulo;

	}

	public String getubicacion() {
		return ubicacion;
	}

	public void Setubicacion(String nuevaubicacion) {
		ubicacion = nuevaubicacion;

	}

	public void caracteristicas() {
		System.out.println("El autor de este libro es: " + autor);
		System.out.println("El titulo del libro es: " + titulo);
		System.out.println("La ubicacion del libro es: " + ubicacion);

	}

}
