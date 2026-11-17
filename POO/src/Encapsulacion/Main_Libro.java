package Encapsulacion;

public class Main_Libro {

	public static void main(String[] args) {
		Libro libro1 = new Libro();
		// Establecer valores con setters
		libro1.setTitulo("Cien años de soledad");
		libro1.setAutor("Gabriel García Márquez");
		libro1.setDisponible(true);
		// Mostrar información inicial
		libro1.mostrarInfo();
		// Intentar prestar y devolver el libro
		libro1.prestar();
		libro1.prestar(); // Intento de prestar nuevamente
		libro1.devolver();
		libro1.devolver(); // Intento de devolver nuevamente
		// Mostrar información final
		libro1.mostrarInfo();
	}

}
