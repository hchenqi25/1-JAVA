package Ejemplo;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Iamgen de la nave");
		Sprite s = new Nave();	
		s.EstablecerImagen();
		System.out.println("Imagen => " + s.imagen);
		s.EstablecerLongitud();
		System.out.println("Longitud =>"+ s.longitud);
		
		System.out.println("Imagen de disparo");
		Sprite sp = new Disparo();
		sp.EstablecerImagen();
		System.out.println("Imagen => " + sp.imagen);
		sp.EstablecerLongitud();
		System.out.println("Longitud =>"+ sp.longitud);

	}

}
