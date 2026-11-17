package Peliculas;

public class Ejecucion {

	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca(9);
		
		Pelicula p = new Pelicula();
		Pelicula_Accion pacc = new Pelicula_Accion();
		
		biblioteca.agregarPelicula(p);
		biblioteca.agregarPelicula(pacc);
		
		biblioteca.mostrarPeliculas();
		
		
		

	}

}
