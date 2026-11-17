package ejercicios;
import java.util.Scanner;
public class ejercicio412_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		        int[] numeros = new int[6];
		        

		     
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print("Introduce un número: ");
		            numeros[i] = sc.nextInt();
		        }

		    
		        System.out.print("Introduce el número que quieres buscar: ");
		        int buscar = sc.nextInt();
		        boolean encontrado = false;

		        for (int n : numeros) {
		            if (n == buscar) {
		                encontrado = true;
		                break;
		            }
		        }

		        if (encontrado) {
		            System.out.println("El número está en la posición :" + encontrado);
		        } else {
		            System.out.println("El número no está en el arryse");
		        }

		        sc.close();
		    }
		}

