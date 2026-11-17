package Ejercicio2;

public class Libros  {

	protected String autor;
	protected String titulo;
	protected String ubicacion;
	
	public Libros() {
		autor ="Alan";
		titulo ="Noches de pasion";
		ubicacion ="Noches ";
		System.out.println("Creando Libro");
	}
	
	public Libros(String a, String t) {
		autor =a;
		titulo = t;
		ubicacion ="No detallada";
		
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

	public void Settitulo(String nuevoTitulo) {
		titulo = nuevoTitulo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void Setubicacion(String nuevaUbicacion) {
		ubicacion = nuevaUbicacion;
	}

	public void caracteristicas() {
		System.out.println("El titulo del libro es: " + titulo);
		System.out.println("El autor del libro es:" + autor);
		System.out.println("La ubicacion del libro es:" + ubicacion);
	}
	
	public String toString() {
	    return "Título: " + titulo +
	           ", Autor: " + autor +
	           ", Ubicación: " + ubicacion;
	}


	


}

