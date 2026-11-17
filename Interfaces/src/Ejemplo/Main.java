package Ejemplo;

public class Main {

	public static void main(String[] args) {
		IAbrir Ventana =  new Ventana();
		Ventana.abrir();
		IAbrir cuaderno = new Cuaderno();
		cuaderno.abrir();

	}

}
