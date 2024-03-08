package Exercicios.ConsumindoAPI.ExerciciosAula3.ConsultaAPIGitHub;

import Exercicios.ConsumindoAPI.ExerciciosAula3.ConsultaAPIGitHub.Excecao.UsuarioNaoEncontradoException;
import Exercicios.ConsumindoAPI.ExerciciosAula3.Excecao.ConsultaAPIGitHub.UsuarioNaoEcontradoException;

public class Usuario {
    private String nome;

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
