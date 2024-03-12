package Exercicios.ConsumindoAPI.ExerciciosAula4.Exercicio2e3;

public class Titulo {
    private String nome;
    private int duracao;

    public Titulo(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nDuração: " + duracao;
    }
}
