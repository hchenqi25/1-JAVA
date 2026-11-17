package Ejercicios;

public class Libro extends Material {
	private String autor;

	public Libro(String titulo, String autor) {
		super(titulo);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Libro," + titulo + "," + autor + "," + prestado;
	}
}