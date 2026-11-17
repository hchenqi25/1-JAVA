package Encapsulacion;

public class Libro {
	private String titulo;
	private String autor;
	private boolean disponible;

	public void setTitulo(String nuevoTitulo) {
		titulo = nuevoTitulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAutor(String nuevoAutor) {
		autor = nuevoAutor;
	}

	public void setDisponible(boolean d) {
		disponible = d;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public void prestar() {
		if (disponible) {
			System.out.println("El libro \"" + titulo + "\" está disponible.");
			disponible = false;
		} else {
			System.out.println("El libro \"" + titulo + "\" ya está prestado.");
		}
	}

	public void devolver() {
		if (!disponible) {
			System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
			disponible = true;
		} else {
			System.out.println("El libro \"" + titulo + "\" ya estaba disponible.");
		}
	}

	public void mostrarInfo() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
	}
}