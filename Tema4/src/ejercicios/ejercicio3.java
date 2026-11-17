package ejercicios;

public class ejercicio3 {

	public static void main(String[] args) {
		byte[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 System.out.println("Días que tiene cada mes:");
	        for (int i = 0; i < diasMes.length; i++) {
	            System.out.println("Mes " + (i + 1) + ": " + diasMes[i] + " días");
	        }
	}

}
