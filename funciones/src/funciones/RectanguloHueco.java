package funciones;
import java.util.Scanner;

public class RectanguloHueco {

    public static void dibujarRectanguloHueco(int ancho, int alto, char letra) {
        for (int fila = 0; fila < alto; fila++) {
            for (int col = 0; col < ancho; col++) {
              
                if (fila == 0 || fila == alto - 1) {
                    System.out.print(letra);
                } else {
                   
                    if (col == 0 || col == ancho - 1) {
                        System.out.print(letra);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el ancho del rectángulo: ");
        int ancho = sc.nextInt();

        System.out.print("Introduce el alto del rectángulo: ");
        int alto = sc.nextInt();

        System.out.print("Introduce el carácter para dibujar: ");
        char letra = sc.next().charAt(0);

        System.out.println("\nRectángulo hueco:\n");
        dibujarRectanguloHueco(ancho, alto, letra);

        sc.close();
    }
}