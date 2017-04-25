package Point_2;

public class Main {
    public static void main(String[] args) {
        Banco BancoAmigo = new Banco("BancoAmigo");
        Cuenta Maria = new Cuenta(15684564, 5000000, "04/01/2017", "Maria del Carmen");
        Cuenta Carlos = new Cuenta(895626, 483657, "15/17/2012", "Carlos Franco");
        BancoAmigo.addCuenta(Maria);
        BancoAmigo.addCuenta(Carlos);
        Tipo Traspaso = new Tipo("Traspaso");
        Tipo Retiro = new Tipo("Retiro");
        Maria.addMovimiento("04/04/2017", 5000000, 400000);
        Maria.addMovimiento("04/04/2017", 4600000, 600000);
        Carlos.addMovimiento("04/04/2017", 483657, 20000);
        Carlos.addMovimiento("04/04/2017", 463657, 63657);
        BancoAmigo.Listar();
    }
}
