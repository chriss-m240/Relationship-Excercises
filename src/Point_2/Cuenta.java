package Point_2;

import java.util.ArrayList;

public class Cuenta {

    private int numeroCuenta;
    private double saldoActual;
    private String fechaCreacion;
    private String nombreCliente;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(int x, double y, String z, String e) {
        this.numeroCuenta = x;
        this.saldoActual = y;
        this.fechaCreacion = z;
        this.nombreCliente = e;
        this.movimientos = new ArrayList<>();
    }

    public void addMovimiento(String x, double y, double z) {
        Movimiento m = new Movimiento(x, y, z);
        this.movimientos.add(m);
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldoActual=" + saldoActual + ", fechaCreacion=" + fechaCreacion + ", nombreCliente=" + nombreCliente + ", movimientos=" + movimientos + '}';
    }
    
    
}
