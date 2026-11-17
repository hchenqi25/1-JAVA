package Ejercicio1;

public class Libro {

	private String titulo;
	private String autor;
	private int año;
	
	public void setTitulo(String t) {
		titulo = t;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutor(String a) {
		autor =a;
	}
	public String getAutor() {
		return autor;
	}
	
	public void setAño(int a) {
		año =a;
	}
	public int getAño() {
		return año;
	}
	
	public void mostrarInfo() {
		System.out.println("Titulo: " + getTitulo() + " Autor => " + getAutor() + " Año=> " + getAño());
		
	}
	
}
