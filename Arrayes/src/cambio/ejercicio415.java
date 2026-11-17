package cambio;

public class ejercicio415 {

	public static void main(String[] args) {
		// Declaramos el array con 4 notas de tipo float
        float[] notas = {8.5f, 7.2f, 9.0f, 6.8f};

        // Variable para almacenar la suma
        float suma = 0;

        // Bucle foreach para recorrer el array y sumar las notas
        for (float nota : notas) {
            suma += nota;
        }

        // Mostrar el resultado por consola
        System.out.println("La suma de las notas es: " + suma);
    }
}
