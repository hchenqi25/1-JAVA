package HrenciaBiblioteca;

public class Main {

	public static void main(String[] args) {
		Libro libro1 = new Libro();
		libro1.setTitulo("El Quijote");
		libro1.setAutor("Miguel de Cervantes");
		libro1.setAno(1605);
		libro1.setPrecio(25.0);
		LibroDigital libroDigital1 = new LibroDigital();
		libroDigital1.setTitulo("Java para principiantes");
		libroDigital1.setAutor("José Pérez");
		libroDigital1.setAno(2020);
		libroDigital1.setPrecio(35.0);
		libroDigital1.setTAno(5.0);
		libro1.mostrarInfo();
		libroDigital1.mostrarInfonDi();

	}

}
