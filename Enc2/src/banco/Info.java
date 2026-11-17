package banco;
import java.util.Scanner;
public class Info {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Banco b = new Banco();
		
		System.out.println("Introduce el nombre del titular");
		b.setTitular(teclado.nextLine());
		
		b.getTitular();
		
		System.out.println("Introduce la cantidad a ingresar: ");
		b.setSaldo(teclado.nextDouble());
		b.getSaldo();
		
		System.out.println("Introduce la cantidad a retirar");
		b.setRetiro(teclado.nextDouble());
		
		
		b.detalles();
teclado.close();	}

}
