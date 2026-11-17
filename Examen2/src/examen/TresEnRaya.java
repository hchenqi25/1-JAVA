package examen;

import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char[][] tablero = new char[3][3];

        // Inicializar tablero con guiones
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }

        char jugador = 'X';
        boolean ganador = false;
        int movimientos = 0;

        while (!ganador && movimientos < 9) {
            // Mostrar tablero directamente
            System.out.println("Tablero:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println(); // salto de línea al terminar cada fila
            }

            System.out.println("Turno del jugador " + jugador);
            System.out.print("Introduce fila (0-2): ");
            int fila = teclado.nextInt();
            System.out.print("Introduce columna (0-2): ");
            int columna = teclado.nextInt();

            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-') {
                tablero[fila][columna] = jugador;
                movimientos++;

                // Comprobar ganador directamente
                boolean filaGanadora = (tablero[fila][0] == jugador && tablero[fila][1] == jugador && tablero[fila][2] == jugador);
                boolean columnaGanadora = (tablero[0][columna] == jugador && tablero[1][columna] == jugador && tablero[2][columna] == jugador);
                boolean diagonalPrincipal = (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador);
                boolean diagonalSecundaria = (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);

                if (filaGanadora || columnaGanadora || diagonalPrincipal || diagonalSecundaria) {
                    System.out.println("Tablero final:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(tablero[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("¡Jugador " + jugador + " ha ganado!");
                    ganador = true;
                } else {
                    jugador = (jugador == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Movimiento inválido, intenta de nuevo.");
            }
        }

        if (!ganador) {
            System.out.println("Empate, no hay ganador.");
        }

        teclado.close();
    }
}