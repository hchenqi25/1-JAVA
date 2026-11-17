package superclase;

public class ProfesorEmerito extends profesor {
    private int añosEmerito;

    public ProfesorEmerito(String n, int e, int ac, int ae) {
        super(n, e, ac);
        añosEmerito = ae;
    }

    public double obtenerSalarioBase() {
        return 925 + añosConsolidados * 33.25 + 47.80 * añosEmerito;
    }
}
