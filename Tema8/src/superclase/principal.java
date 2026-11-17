package superclase;

public class principal {
    public static void main(String[] args) {

        ProfesorEmerito p = new ProfesorEmerito("Juan", 65, 20, 5);

        double salario = p.obtenerSalarioBase();

        System.out.println("Salario base: " + salario);
    }
}
