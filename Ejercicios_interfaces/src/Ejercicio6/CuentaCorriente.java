package Ejercicio6;

public class CuentaCorriente extends CuentaBancaria implements Transferible {

    public CuentaCorriente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void transferir(CuentaBancaria destino, double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a transferir debe ser positivo.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Error: saldo insuficiente para transferir.");
            return;
        }

        this.saldo -= monto;
        destino.depositar(monto);

        System.out.println("Transferencia realizada desde Cuenta Corriente de " + titular +
                           " hacia " + destino.titular + " por " + monto);
    }
}