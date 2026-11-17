package clase;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][][] tabla = new int[3][8][1]; 

      
        for (int aula = 0; aula < tabla.length; aula++) {
            System.out.println("Aula " + (aula + 1));
            for (int alumno = 0; alumno < tabla[aula].length; alumno++) {
                System.out.println("  Alumno " + (alumno + 1));
                for (int nota = 0; nota < tabla[aula][alumno].length; nota++) {
                    System.out.print("    Calificación " + (nota + 1) + ": ");
                    tabla[aula][alumno][nota] = teclado.nextInt();
                }
            }
        }

       
        System.out.println("Resumen de calificaciones:");
        for (int aula = 0; aula < tabla.length; aula++) {
            System.out.println("Aula " + (aula + 1));
            for (int alumno = 0; alumno < tabla[aula].length; alumno++) {
                System.out.print("  Alumno " + (alumno + 1) + ": ");
                for (int nota = 0; nota < tabla[aula][alumno].length; nota++) {
                    System.out.print(tabla[aula][alumno][nota] + " ");
                }
                System.out.println();
            }
        }
 int suma =0;
 int promedio = suma/24;
 System.out.print(promedio );
    
      
        
        teclado.close();
    }
}