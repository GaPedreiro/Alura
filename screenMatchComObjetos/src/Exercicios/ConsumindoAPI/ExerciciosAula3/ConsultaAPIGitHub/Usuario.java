package Exercicios.ConsumindoAPI.ExerciciosAula3.ConsultaAPIGitHub;

public class Usuario {
    private String nome;
    private String message;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
