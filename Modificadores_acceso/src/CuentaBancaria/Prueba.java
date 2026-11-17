package CuentaBancaria;

public class Prueba {

    public static void main(String[] args) {

       
        Banco banco = new Banco();

        CuentaBancaria cb = new CuentaBancaria();
        cb.setTitular("Juan Pérez");
        cb.setNumeroCuenta("123-456");
        cb.setSaldo(500.0);
        cb.setTipoCuenta("Corriente");

        banco.agregarCuenta(cb);

       
        CuentaAhorro ca = new CuentaAhorro();
        ca.setTitular("María López");
        ca.setNumeroCuenta("789-101");
        ca.setSaldo(1500.0);
        ca.setTipoCuenta("Ahorro");
        ca.setIntereses(2.5);

        banco.agregarCuenta(ca);

   
        System.out.println("---- Cuenta Bancaria ----");
        cb.mostrarInformacion();

        System.out.println("\n---- Cuenta Ahorro ----");
        ca.mostrarInformacion();
        ca.mostrarInformacionCuentaAhorro();

        System.out.println("\n---- Banco ----");
        banco.mostrarTotalCuentas();
    }
}