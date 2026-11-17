package repeticion;

public class ejercicio326 {

	public static void main(String[] args) {
		for (int num = 100; num <= 130; num++) {
            if (num % 5 == 0 || num % 6 == 0 || num % 7 == 0) {
                System.out.println(num);
            }
		}

	}

}
