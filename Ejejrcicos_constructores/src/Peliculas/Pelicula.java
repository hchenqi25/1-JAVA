package Peliculas;

public class Pelicula {
	
	protected String Titulo;
	protected int duracionPelicula;
	protected int anioEstrenoPelicula;
	
	
public Pelicula() {
	Titulo ="Alan";
	duracionPelicula = 230;
	anioEstrenoPelicula =2026;
}

public void mostrarInformacion() {
	System.out.println("Titulo de la pelicula: " + Titulo);
	System.out.println("Duracion de la pelicula: " + duracionPelicula);
	System.out.println("Año de estreno: " + anioEstrenoPelicula);
	
	System.out.println("---------------------------------------------------------------");
}

}
