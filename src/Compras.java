import java.util.Formatter;

public class Compras implements Comparable<Compras>{
    private String nome;
    private double preco;

    public Compras(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("Compra:\n" +
                "Nome - %s\n'" + this.nome +
                "Preço - %.2f\n" + this.preco);
    }

    @Override
    public int compareTo(Compras compras) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(compras.getPreco()));

    }
}
