package Biblioteca;

public class Libro {

	private String titulo;
	private String autor;
	private boolean disponible;

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public void prestar() {
		if (disponible) {
			disponible = false;
			System.out.println("El libro ha sido prestado.");
		} else {
			System.out.println("El libro ya estaba prestado.");
		}
	}

	public void devolver() {
		if (!disponible) {
			disponible = true;
			System.out.println("El libro ha sido devuelto.");
		} else {
			System.out.println("El libro ya estaba disponible.");
		}
	}

	public void mostrarInfo() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Disponible: " + disponible);
	}
}