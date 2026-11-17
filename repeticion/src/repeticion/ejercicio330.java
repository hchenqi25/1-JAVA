package repeticion;

public class ejercicio330 {

	public static void main(String[] args) {
		for (int i = 85; i >= 17; i--) {
            if (i % 2 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    







for (int i = 85; i >= 17; i--) {
    if (i % 2 == 0 || i % 5 == 0) {
        continue; 
    }
    System.out.println(i);
}
}
}

