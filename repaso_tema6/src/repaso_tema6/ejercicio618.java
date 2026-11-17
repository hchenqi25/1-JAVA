package repaso_tema6;

import java.util.Scanner;

public class ejercicio618 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce una fecha en formato dd/mm/aaaa: ");
            String fecha = teclado.nextLine();

            // Compruebo la longitud y los epsacios
            if (fecha.length() != 10 || fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
                throw new IllegalArgumentException("Formato incorrecto. Usa dd/mm/aaaa con '/' en las posiciones 3 y 6.");
            }

            // Construyo un array con 3 posiciones e inserto por partes correspondientes cada posicion
            String[] partes = new String[3];
            partes[0] = "" + fecha.charAt(0) + fecha.charAt(1); // día
            partes[1] = "" + fecha.charAt(3) + fecha.charAt(4); // mes
            partes[2] = "" + fecha.charAt(6) + fecha.charAt(7) + fecha.charAt(8) + fecha.charAt(9); // año

            // Compruebo que no haya espacios 
            for (int i = 0; i < 3; i++) {
                if (partes[i].trim().isEmpty()) {
                    throw new IllegalArgumentException("Campo vacío en la fecha. Asegúrate de escribir todos los valores.");
                }
            }
            System.out.println("Fecha introducida: " + partes[0] + "/" + partes[1] + "/" + partes[2]);

            //Compruebo las excepciones
        } catch (Exception e) {
            System.out.println("Se ha producido una excepción:");
            System.out.println("Tipo: " + e.getClass().getSimpleName());
            System.out.println("Mensaje: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}