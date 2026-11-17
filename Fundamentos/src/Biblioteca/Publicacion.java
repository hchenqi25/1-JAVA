package Biblioteca;

public abstract class Publicacion {
	protected String titulo;
	protected String autor;
	protected double precio;

	public Publicacion(String titulo, String autor, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public abstract void mostrarInformacion();

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPrecio() {
		return precio;
	}
}