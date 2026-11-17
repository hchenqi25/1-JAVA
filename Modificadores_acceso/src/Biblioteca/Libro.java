package Biblioteca;

public class Libro {
	private String titulo;
	private String autor;
	protected  int anoPublicacion;
	double precio;
	
	
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo (String nuevoTitulo) {
		titulo = nuevoTitulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor( String nuevoAutor) {
		autor = nuevoAutor;
	}
	
	
	public void mostrarInfo() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " +autor);
	}
	
	private void CalcularDescuento() {
		double precioFinal = precio * 0.90;
		System.out.println("Precio con descuento: " + precioFinal);
	}

}
