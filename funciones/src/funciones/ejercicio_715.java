package funciones;

public class ejercicio_715 {
	
	public class VariablesLocales {
		public static void duplicar(int n) {
		n *= 2;
		System.out.println("Ahora, en la función \"duplicar\" el valor de n es: " + n);
		}
		public static void main(String[] args) {
		int n = 5;
		System.out.println("El valor de n es: " + n);
		duplicar(n);
		System.out.println("Y ahora, otra vez en la función \"main\" el valor de n es:" + n);
		}
		}



	}


