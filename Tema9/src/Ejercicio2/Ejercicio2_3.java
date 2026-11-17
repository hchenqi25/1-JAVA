package Ejercicio2;

import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;

public class Ejercicio2_3{

    public static void main(String[] args) {

        Stack pila = new Stack();
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce la expresión en notación polaca inversa:");
        String linea = in.nextLine();

        String[] datos = linea.split(" ");

        try {
            procesarExpresion(datos, pila);
            System.out.println("Resultado final: " + pila.pop());
        }

        catch (EmptyStackException e) {
            System.out.println("Error: faltan operandos para realizar la operación.");
        }
        catch (ClassCastException e) {
            System.out.println("Error: la pila contiene un dato que no es numérico.");
        }
        catch (NumberFormatException e) {
            System.out.println("Erro de numero");
        }
    }


    public static void procesarExpresion(String[] datos, Stack pila) {

        for (int i = 0; i < datos.length; i++) {

            String elemento = datos[i];

            if (esOperador(elemento)) {
                double b = (double) pila.pop();
                double a = (double) pila.pop();
                double resultado = operar(a, b, elemento);
                pila.push(resultado);
            }
            else {
                
                double num = elemento.charAt(0) - '0';
                pila.push(num);
            }
        }
    }

    public static boolean esOperador(String elemento) {
        return elemento.equals("+") || elemento.equals("-") ||
               elemento.equals("*") || elemento.equals("/");
    }

    public static double operar(double a, double b, String operador) {
        if (operador.equals("+")) return a + b;
        if (operador.equals("-")) return a - b;
        if (operador.equals("*")) return a * b;
        if (operador.equals("/")) return a / b;
        return 0;
    }
}