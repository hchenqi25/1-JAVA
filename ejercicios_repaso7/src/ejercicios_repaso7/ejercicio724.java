package ejercicios_repaso7;

import java.util.Scanner;

public class ejercicio724 {

    public static void calcularAreaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }

    public static void calcularCircunferencia(double radio) {
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }

    public static void calcularAreaRectangulo(double base, double altura) {
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }

    public static void calcularPerimetroRectangulo(double base, double altura) {
        double perimetro = 2 * (base + altura);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el radio del círculo: ");
        double radio = teclado.nextDouble();

        calcularAreaCirculo(radio);
        calcularCircunferencia(radio);

        System.out.print("Introduce la base del rectángulo: ");
        double base = teclado.nextDouble();

        System.out.print("Introduce la altura del rectángulo: ");
        double altura = teclado.nextDouble();

        calcularAreaRectangulo(base, altura);
        calcularPerimetroRectangulo(base, altura);

        teclado.close();
    }
}