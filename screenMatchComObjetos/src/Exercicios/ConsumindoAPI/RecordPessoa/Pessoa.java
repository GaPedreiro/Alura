package Exercicios.ConsumindoAPI.RecordPessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa() {}

    public Pessoa(MapeaPessoa mapeaPessoa) {
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "\nnome: " + nome +
                ",\nidade: " + idade +
                ",\naltura: " + altura;
    }
}
