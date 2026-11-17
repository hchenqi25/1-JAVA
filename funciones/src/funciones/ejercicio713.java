package funciones;

public class ejercicio713 {
    public static int saberSiEsPrimo(int numero) {
        if (numero <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int numero = 4;
        int resultado = saberSiEsPrimo(numero);

        if (resultado == 1) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " NO es primo.");
        }
    }
}