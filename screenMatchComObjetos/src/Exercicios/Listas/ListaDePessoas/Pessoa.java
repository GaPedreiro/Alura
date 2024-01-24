package Exercicios.Listas.ListaDePessoas;

public class Pessoa {
    private String name;
    private int idade;

    public Pessoa (String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa: " + name + " \nIdade: " + idade;
    }
}
