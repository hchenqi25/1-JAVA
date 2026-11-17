package Peliculas;

public class Pelicula_Accion extends Pelicula {
	private String calificacionPelicula;

	
	public Pelicula_Accion() {
		Titulo ="Kratos(Antonio)";
		duracionPelicula = 450;
		anioEstrenoPelicula =2032;
		calificacionPelicula ="+18";
	}
	
	public void msotrarInformacionAccion() {
		System.out.println("Titulo: " + Titulo);
		System.out.println("Duracion de la pelicula: " +duracionPelicula);
		System.out.println("Año de estreno: " + anioEstrenoPelicula);
		System.out.println("Calificacion de la pelicula: " + calificacionPelicula);
	}
}
