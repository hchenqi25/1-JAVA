package Colegio;

import java.util.Scanner;

public class info {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Estudiante es = new Estudiante();

		System.out.println("Introduce el nombre del estudiante: ");
		es.setNombre(teclado.nextLine());

		es.getNombre();

		System.out.println("Introduce la edad del estudiante");
		es.setEdad(teclado.nextInt());

		es.getEdad();

		System.out.println("Introduce la calificacion: ");
		es.setCalificacion(teclado.nextDouble());

		es.getCalificacion();

		es.mostrarInfo();

		teclado.close();
	}

}
