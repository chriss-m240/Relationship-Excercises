package Point_2;

public class Movimiento {

    private String fecha;
    private double saldoAnterior;
    private double cantidad;

    public Movimiento(String x, double y, double z) {
        this.fecha = x;
        this.saldoAnterior = y;
        this.cantidad = z;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "fecha=" + fecha + ", saldoAnterior=" + saldoAnterior + ", cantidad=" + cantidad + '}';
    }

}
