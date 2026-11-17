package Ejercicio2;

public class Ingeniero extends Empleado {

    float extraCertificacion;

    public Ingeniero(String n, float s, float extra) {
        nombre = n;
        salario = s;
        extraCertificacion = extra;
    }

  
    public float Salario() {
        return salario;
    }

    
    public float Salario(int certificaciones) {
        return salario + (certificaciones * extraCertificacion);
    }
}
