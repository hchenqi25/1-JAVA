package funciones;

public class ejercicio711 {

	public static int contarLetra(String cadena, char letra) {
	    int contador = 0;
	    for (int i = 0; i < cadena.length(); i++) {
	        if (cadena.charAt(i) == letra) {
	            contador++;
	        }
	    }
	    return contador;
	}
}