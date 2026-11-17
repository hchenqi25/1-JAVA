package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Estudiante e = new Estudiante();

		System.out.println("Introduzca el nombre del estudiante: ");
		e.Setnombre(teclado.nextLine());
		e.Getnombre();

		System.out.println("Introduzca la edad del estudiante: ");
		e.Setedad(teclado.nextInt());
		e.Getedad();

		System.out.println("Introduzca la calificacion del estudiante: ");
		e.Setcalificaion(teclado.nextDouble());
		e.Getcalificacion();

		System.out.println("--------INFORMACION DEL ALUMNO-------------");
		e.mostarInfo();

		teclado.close();
	}

}
