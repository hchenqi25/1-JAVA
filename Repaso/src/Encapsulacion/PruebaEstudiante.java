package Encapsulacion;
import java.util.Scanner;
public class PruebaEstudiante {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Estudiante es = new Estudiante();
		
		System.out.println("Introduce el nombre del alumno =>");
		es.setNombre(teclado.nextLine());
		System.out.println("Introduce la edad del alumno =>");
		es.setEdad(teclado.nextInt());
		System.out.println("Introduce la calificacion del alumno =>");
		es.setCalificacion(teclado.nextDouble());
		
		es.MostrarInfo();
	teclado.close();}

}
