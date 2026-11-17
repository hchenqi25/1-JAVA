package Ejercicio6;

public class CuentaAhorro extends CuentaBancaria implements Transferible {

    public CuentaAhorro(String titular, double saldoInicial) {
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

        System.out.println("Transferencia realizada desde Cuenta Ahorro de " + titular +
                           " hacia " + destino.titular + " por " + monto);
    }
}
