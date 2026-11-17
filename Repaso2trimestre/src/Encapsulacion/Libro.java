package Encapsulacion;

public class Libro {
	private String titulo;
	private String autor;
	private boolean disponible;

	public void setTiulo(String t) {
		titulo = t;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAtutor(String a) {
		autor = a;
	}

	public String getAutor() {
		return autor;
	}
	public void setDisponible(boolean d) {
		
	}
	public boolean getDisponibilidad() {
		return disponible;
	}
	public void  prestar() {
		if(disponible) {
			System.out.println("El libro con tiulo =>" + titulo + "esta disponible ");
			disponible = false;
		}else {
			System.out.println("El libro con titulo => " + titulo + "no esta disponible");
		}
	}
	
	public void delvolver() {
		if(!disponible) {
			System.out.print("El libro con titulo => " + titulo + "ha sido devuelto");
			disponible = true;
		}else {
			System.out.println("El libro con titulo => " + titulo + "no ha sido devuelto");
		
		}
		
	}
	public void MostrarInfo() {
		System.out.println("El libro con titulo =>" + getTitulo());
		System.out.println("El autor del libro es =>" + getAutor());
		System.out.println("Disponibilidad => " + disponible);
	}

}
