package funciones;

public class ejercicio79 {

    public static int Calculo(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        
        int resultado = Calculo(5, 10);
        System.out.println("El menor es: " + resultado);
    }
}
