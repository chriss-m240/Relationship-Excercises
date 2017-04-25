package Point_2;

import java.util.ArrayList;

public class Banco {

    private String codido;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Tipo> tipos;

    public Banco(String x) {
        this.codido = x;
        this.cuentas = new ArrayList<>();
        this.tipos = new ArrayList<>();
    }

    public void addCuenta(Cuenta x) {
        this.cuentas.add(x);
    }

    public void addTipos(Tipo x) {
        this.tipos.add(x);
    }
    public void Listar(){
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }
}
