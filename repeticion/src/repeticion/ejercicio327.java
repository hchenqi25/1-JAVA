package repeticion;

public class ejercicio327 {

	public static void main(String[] args) {
		int lado = 3;

        for (int fila = 0; fila < lado; fila++) {
            for (int columna = 0; columna < lado; columna++) {
                if (fila == 0 || fila == lado - 1 || columna == 0 || columna == lado - 1) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
	}
            }
        }

