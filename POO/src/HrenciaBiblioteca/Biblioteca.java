package HrenciaBiblioteca;

public class Biblioteca {
	int cantidad;
	
	
	public void agrgarLibro(Libro libro) {
		cantidad++;
		System.out.println("Libro agrgado " + libro.getTitulo());
	}
	
	protected void mostrarCantidad() {
		System.out.println("Cantidad de libros => " + cantidad);
	}

}
