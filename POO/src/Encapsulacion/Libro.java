package Encapsulacion;

public class Libro {
	
	private String titulo;
	private String autor;
	private boolean disponible;
	
	
	
	public void setTitulo(String t) {
		titulo = t;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutor(String a) {
		autor =a;
	}
	
	public  String getAutor() {
		return autor;
	}
	
	public void setDisponible(boolean d) {
		disponible =d;
	}
	
	public boolean getDisponible() {
		return disponible;
	}
	
	public void prestar() {
		if(disponible) {
			System.out.print("Esta disponible" + titulo) ;
			disponible = false;
		}else {
			System.out.print("No disponible");
		}
	}
	
	public void devolver() {
		if(!disponible) {
			System.out.println("El libro: " + titulo + " ha sido devuelto");
			disponible = true;
		}else {
			System.out.println("ya es disponible");
		}
	}
	
	public void mostrarInfo() {
		System.out.println("Titulo => " + titulo);
		System.out.println("Autor => " + autor);
		System.out.println("Disponibilidad => " + disponible);
	}

}
