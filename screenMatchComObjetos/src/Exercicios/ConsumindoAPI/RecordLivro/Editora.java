package Exercicios.ConsumindoAPI.RecordLivro;

public class Editora {
    private String cidade;
    private String nome;

    public Editora(String cidade, String nome) {
        this.cidade = cidade;
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNome() {
        return nome;
    }
}
