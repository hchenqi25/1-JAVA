package Ejercicio2;

public class Documento extends Libros{
	protected int paginas;
	
	public Documento() {
		System.out.println("Creando documento");
	}
	
	public void setPaginas(int numero) {
		paginas = numero;
	}
	
	public int getPaginas() {
		return paginas;
	}
	public void caracteristicas() {
		System.out.println("El titulo del libro es: " + getTitulo());
		System.out.println("El autor del libro es:" + getAutor());
		System.out.println("La ubicacion del libro es:" + getUbicacion());
		System.out.println("Paginas: " + getPaginas());
	}
	
	public String toString() {
	    return "Título: " + getTitulo() +
	           ", Autor: " + getAutor() +
	           ", Ubicación: " + getUbicacion() +
	           ", Páginas: " + paginas;
	}

}
