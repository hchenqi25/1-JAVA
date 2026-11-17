package Relacion2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> listaGeneral = new ArrayList<>();
		Map<String, List<String>> mapaCategorias = new HashMap<>();
		Queue<String> colaPendientes = new LinkedList<>();
		Stack<String> pilaHistorico = new Stack<>();

		int opcion;

		do {
			System.out.println("--- MENÚ DE TAREAS ---");
			System.out.println("1. Agregar nueva tarea");
			System.out.println("2. Completar siguiente tarea pendiente");
			System.out.println("3. Mostrar última tarea completada");
			System.out.println("4. Listar tareas por categoría");
			System.out.println("5. Mostrar todas las tareas registradas");
			System.out.println("6. Salir");
			System.out.print("Elige una opción: ");

			opcion = leerEntero(sc);

			switch (opcion) {
			case 1:
				agregarTarea(sc, listaGeneral, mapaCategorias, colaPendientes);
				break;

			case 2:
				completarTarea(colaPendientes, pilaHistorico);
				break;

			case 3:
				mostrarUltimaCompletada(pilaHistorico);
				break;

			case 4:
				listarPorCategoria(sc, mapaCategorias);
				break;

			case 5:
				mostrarTodas(listaGeneral);
				break;

			case 6:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida.");
			}

		} while (opcion != 6);

		sc.close();
	}

	public static void agregarTarea(Scanner sc, List<String> listaGeneral, Map<String, List<String>> mapaCategorias,
			Queue<String> colaPendientes) {

		sc.nextLine(); 
		System.out.print("Introduce la categoría: ");
		String categoria = sc.nextLine();

		System.out.print("Introduce la descripción de la tarea: ");
		String descripcion = sc.nextLine();

		String tarea = categoria + ": " + descripcion;

		listaGeneral.add(tarea);
		colaPendientes.add(tarea);

		mapaCategorias.putIfAbsent(categoria, new ArrayList<>());
		mapaCategorias.get(categoria).add(descripcion);

		System.out.println("Tarea agregada correctamente.");
	}

	public static void completarTarea(Queue<String> colaPendientes, Stack<String> pilaHistorico) {
		if (colaPendientes.isEmpty()) {
			System.out.println("No hay tareas pendientes.");
			return;
		}

		String tarea = colaPendientes.poll();
		pilaHistorico.push(tarea);

		System.out.println("Tarea completada: " + tarea);
	}

	public static void mostrarUltimaCompletada(Stack<String> pilaHistorico) {
		if (pilaHistorico.isEmpty()) {
			System.out.println("No hay tareas completadas aún.");
			return;
		}

		System.out.println("Última tarea completada: " + pilaHistorico.peek());
	}

	public static void listarPorCategoria(Scanner sc, Map<String, List<String>> mapaCategorias) {
		sc.nextLine();
		System.out.print("Introduce la categoría a consultar: ");
		String categoria = sc.nextLine();

		if (!mapaCategorias.containsKey(categoria)) {
			System.out.println("No existe esa categoría.");
			return;
		}

		System.out.println("Tareas en la categoría '" + categoria + "':");
		for (String t : mapaCategorias.get(categoria)) {
			System.out.println("- " + t);
		}
	}

	public static void mostrarTodas(List<String> listaGeneral) {
		if (listaGeneral.isEmpty()) {
			System.out.println("No hay tareas registradas.");
			return;
		}

		System.out.println("Todas las tareas registradas:");
		for (String t : listaGeneral) {
			System.out.println("- " + t);
		}
	}

	public static int leerEntero(Scanner sc) {
		try {
			return sc.nextInt();
		} catch (Exception e) {
			sc.nextLine();
			return -1;
		}
	}
}
