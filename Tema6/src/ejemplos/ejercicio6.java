package ejemplos;

public class ejercicio6 {

	public static void main(String[] args) {
		String texto = null;

        try {
            int longitud = texto.length();
            System.out.println("Longitud: " + longitud);
        } catch (Exception e) {
            System.out.println("Error la variable es nula.");
        }

	}

}
