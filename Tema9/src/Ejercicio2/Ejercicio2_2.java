package Ejercicio2;
import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;

public class Ejercicio2_2 {

    public static void main(String[] args) {

        Stack pila = new Stack();
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce la expresión en notación polaca inversa:");
        String linea = in.nextLine();

        String[] datos = linea.split(" ");

        try {

            for (int i = 0; i < datos.length; i++) {

                String elemento = datos[i];

                if (elemento.equals("+") || elemento.equals("-") ||
                    elemento.equals("*") || elemento.equals("/")) {

                    double b = (double) pila.pop();
                    double a = (double) pila.pop();
                    double resultado = 0;

                    if (elemento.equals("+")) resultado = a + b;
                    else if (elemento.equals("-")) resultado = a - b;
                    else if (elemento.equals("*")) resultado = a * b;
                    else if (elemento.equals("/")) resultado = a / b;

                    pila.push(resultado);
                }
                else {
                    double num = elemento.charAt(0) - '0';
                    pila.push(num);
                }
            }

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
    }}