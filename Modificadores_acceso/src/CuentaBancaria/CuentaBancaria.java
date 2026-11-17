package CuentaBancaria;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    protected String titular;
    String tipoCuenta;   // default

    // SETTERS
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    // GETTERS
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // Método solicitado
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }

    // Método privado solicitado
    private void calcularIntereses() {
        double intereses = saldo * 0.02;
        System.out.println("Intereses generados (2%): " + intereses);
    }
}


