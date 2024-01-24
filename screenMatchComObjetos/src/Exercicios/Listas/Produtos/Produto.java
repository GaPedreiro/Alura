package Exercicios.Listas.Produtos;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "- Nome: " + this.nome +
                "\n- Preço: " + this.preco +
                "\n- Quantidade: " + this.quantidade;
    }
}
