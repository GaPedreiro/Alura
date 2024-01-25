package Exercicios.Listas.ProdutosPrecoMedio;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "\n- Produto: " + this.nome + " (R$" + this.preco + ")";
    }
}
