package Ejercicio6;

public class Main {
    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente("Ana", 1000);
        CuentaAhorro ca = new CuentaAhorro("Luis", 500);

        System.out.println("=== Operaciones Iniciales ===");
        cc.depositar(200);
        ca.retirar(100);

        System.out.println("\n=== Transferencias ===");
        cc.transferir(ca, 300);
        ca.transferir(cc, 50);

        System.out.println("\n=== Saldos Finales ===");
        System.out.println("Saldo Cuenta Corriente (Ana): " + cc.consultarSaldo());
        System.out.println("Saldo Cuenta Ahorro (Luis): " + ca.consultarSaldo());
    }
}