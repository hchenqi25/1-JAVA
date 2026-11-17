package ejemplos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.print("Introduce un numero: ");
			int num1 = sc.nextInt(); 
			System.out.print("Introduce otro numero: "); 
			 int num2 = sc.nextInt();
			 
			 int resultado = (num1 / num2);
			 
			System.out.print("El resultado es: "  + resultado);
		}catch (InputMismatchException e) {
            System.out.println("Error debes introducir un numero");
		}catch (ArithmeticException e) {
            System.out.println("Error division por cero no permitida");
		}catch (Exception e) {
			System.out.print("Error de entrada");
		}finally {
			System.out.println("Gracias");
		}
		
		 

	sc.close();}

}
