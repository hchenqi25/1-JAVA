package arrayse;
import java.util.Scanner;

public class ejerciccio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[2][3];

        // Rellenar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce un número: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Mostrar la matriz completa
        System.out.println("Matriz introducida:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // salto de línea al terminar cada fila
        }
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }

 System.out.print(sumaFila);
        teclado.close();
    }
}
}
