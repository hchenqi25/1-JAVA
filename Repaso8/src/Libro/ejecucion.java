package Libro;

public class ejecucion {

	public static void main(String[] args) {
		Libro r = new Libro();
		
		r.getAutor();
		r.getTitulo();
		r.getubicacion();
		r.caracteristicas();
		
		
		r.Setautor("Aristoteles");
		r.Settitulo("El mito del carro alado ");
		r.Setubicacion("Atenas");
		r.caracteristicas();
	}

}
