package funciones;

public class ejercicio719 {

    public static void main(String[] args) {
        
    }
}

class PalindromoFunciones {

    public static boolean esPalindromo(String texto) {
        texto = normalizar(texto);
        return comprobarPalindromo(texto, 0, texto.length() - 1);
    }

    private static String normalizar(String texto) {
        return texto.replaceAll("s+", "").toLowerCase();
    }

    public static boolean comprobarPalindromo(String texto, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        if (texto.charAt(inicio) != texto.charAt(fin)) {
            return false;
        }
        return comprobarPalindromo(texto, inicio + 1, fin - 1);
    }
}