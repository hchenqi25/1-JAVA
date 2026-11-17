package Ejercicio3;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime la capacidad del array: ");
		int capacidad = teclado.nextInt();

		Empleado[] em = new Empleado[capacidad];

		for (int i = 0; i < em.length; i++) {
			System.out.print(
					"Elige opcion 1-Gerente 2- DesarrolladorBacken 3- DesarroladorFronted  4 - asistente ");
			int opcion = teclado.nextInt();

			if (opcion == 1) {

				Gerente ge = new Gerente();
				System.out.println("Introdcue el nombre: ");
				ge.setNombre(teclado.nextLine());
				System.out.println("Introduce su identificacion: ");
				ge.setIdentificacion(teclado.nextInt());
				System.out.println("Introduce su puesto: ");
				ge.setPuesto(teclado.nextLine());

				em[i] = ge;

			} else if (opcion == 2) {
				DesarroladorBackend de = new DesarroladorBackend();
				System.out.println("Introduce el nombre: ");
				de.setNombre(teclado.nextLine());
				System.out.println("Introduce la identificacion");
				de.setIdentificacion(teclado.nextInt());
				System.out.println("Introduce el, lenguaje de programacion: ");
				de.setLenguaje(teclado.nextLine());
				System.out.println("Introduce el fondo que use: ");
				de.setTema(teclado.nextLine());

				em[i] = de;
			} else if (opcion == 3) {
				DesarrolladorFronted df = new DesarrolladorFronted();
				System.out.println("Introduce su nombre: ");
				df.setNombre(teclado.nextLine());
				System.out.println("Introduce su identificacion");
				df.setIdentificacion(teclado.nextInt());
				System.out.println("Introduce su rama: ");
				df.setRama(teclado.nextLine());
				System.out.println("Introduce el lenguaje que usa: ");
				df.setLenguaje(teclado.nextLine());
				em[i] = df;

			} else if (opcion == 4) {
				Asistente a = new Asistente();

				System.out.println("Introduce su nombre:");
				a.setNombre(teclado.nextLine());
				System.out.println("Introdue su identificacion:");
				a.setIdentificacion(teclado.nextInt());
				System.out.println("Introduce su oficio: ");
				a.setOficio(teclado.nextLine());

				em[i] = a;
			} 
			}
		   System.out.println("--------------- MOSTRANDO EMPLEADOS ---------------");
	        for (int i = 0; i < em.length; i++) {
	            em[i].mostrarInfo();
	            System.out.println("-----------------------------------");

		}
	teclado.close();}
}




