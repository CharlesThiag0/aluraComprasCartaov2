import java.util.LinkedList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compras> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new LinkedList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }

    public boolean adicionarCompra(Compras compras) {
        if (this.saldo >= compras.getPreco()) {
            this.saldo -= compras.getPreco();
            this.compras.add(compras);
            return true;
        }
        return false;

    }

}
