package clase;
import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cuantas posiciones quieres: ");
        int num = teclado.nextInt();
        teclado.nextLine(); 

        String[] agenda = new String[num];
        for (int i = 0; i < agenda.length; i++) {
            System.out.print("Dime los nombres a rellenar " + (i + 1) + ": ");
            agenda[i] = teclado.nextLine();
        }

        System.out.print("Dime el nombre a eliminar: ");
        String eliminar = teclado.nextLine();

        int nuevoTam = agenda.length;
        boolean encontrado = false;

        for (int i = 0; i < nuevoTam; i++) {
            if (agenda[i].equals(eliminar)) {
                for (int j = i; j < nuevoTam - 1; j++) {
                    agenda[j] = agenda[j + 1];
                }
                nuevoTam--;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Array después de eliminar:");
            for (int i = 0; i < nuevoTam; i++) {
                System.out.println(agenda[i]);
            }
        } else {
            System.out.println("Nombre no encontrado.");
            
        }
        String[] nuevaAgenda = new String[agenda.length + 1];
        for (int i = 0; i < agenda.length; i++) {
            nuevaAgenda[i] = agenda[i];
        }
        System.out.print("Dime el nombre a insertar al final: ");
        nuevaAgenda[agenda.length] = teclado.nextLine();
        agenda = nuevaAgenda;
        for (int i = 0; i < nuevaAgenda.length; i++) {
            System.out.println(nuevaAgenda[i]);


  teclado.close();  }
    }}
