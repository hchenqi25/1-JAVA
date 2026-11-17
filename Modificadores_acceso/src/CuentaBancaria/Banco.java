package CuentaBancaria;

public class Banco {

    int totalCuentas;   

    
    public void agregarCuenta(CuentaBancaria cuenta) {
        totalCuentas++;   
    }

    
    protected void mostrarTotalCuentas() {
        System.out.println("Número de cuentas en el banco: " + totalCuentas);
    }
}