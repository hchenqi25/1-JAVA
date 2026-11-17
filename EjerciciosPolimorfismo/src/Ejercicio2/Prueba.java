package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {

        Gerente g = new Gerente("Carlos", 7000, 500);
        Ingeniero i = new Ingeniero("Ana", 5000, 100);
        Asistente a = new Asistente("Luis", 3000);

        System.out.println("Salario del Gerente: " + g.Salario());
        System.out.println("Salario del Ingeniero: " + i.Salario());
        System.out.println("Salario del Asistente: " + a.Salario());
        System.out.println("Salario del Ingeniero con 3 certificaciones: " + i.Salario(3));
    }
}
