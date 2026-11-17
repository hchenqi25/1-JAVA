package HrenciaBiblioteca;

public class Libro {
	private String titulo;
	private String autor;
	protected int anoPublicacion;
	double precio;
	
	public void setTitulo(String t) {
		titulo = t;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutor(String a) {
		autor=a;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void mostrarInfo() {
		System.out.println("Titulo => " + titulo);
		System.out.println("Autor => " + autor);
	}
	
	public void setAno(int a) {
		anoPublicacion =a;
	}
	
	public int getAno() {
		return anoPublicacion;
	}
	
	public void setPrecio(double p) {
		precio = p;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	
	private void calcularPrecioConDescuento() {
		double descuento = precio * 0.10;
		
		System.out.println("El precio del libro es de => " + descuento);
	}

}
