package repaso_tema6;

import java.util.Scanner;

public class ejercicio619 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce la contraseña: ");
            String contraseña1 = teclado.nextLine();

            System.out.print("Vuelve a introducir la contraseña: ");
            String contraseña2 = teclado.nextLine();

            if (!contraseña1.equals(contraseña2)) {
                throw new IllegalArgumentException("Las contraseñas no coinciden");
            }

            System.out.println("Contraseña confirmada correctamente.");

        } catch (Exception e) {
            System.out.println("Se ha producido una excepción:");
            System.out.println("Tipo: " + e.getClass().getSimpleName());
            System.out.println("Mensaje: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa. Gracias por usar el sistema.");
            teclado.close();
        }
    }
}