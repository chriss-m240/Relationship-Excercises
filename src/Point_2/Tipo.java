package Point_2;

public class Tipo {

    private String codigo;
    private Movimiento tipo;

    public Tipo(String x) {
        this.codigo = x;
    }

    public void addMovimiento(Movimiento x) {
        this.tipo = x;
    }
}
