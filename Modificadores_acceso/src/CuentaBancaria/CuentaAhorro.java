package CuentaBancaria;

public class CuentaAhorro extends CuentaBancaria {

    private double intereses;

    public void setIntereses(double nintereses) {
        intereses = nintereses;
    }

    public double getIntereses() {
        return intereses;
    }

    public void mostrarInformacionCuentaAhorro() {
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Intereses: " + intereses);
    }
}