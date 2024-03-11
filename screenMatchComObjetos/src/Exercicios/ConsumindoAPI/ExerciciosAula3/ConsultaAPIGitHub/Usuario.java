package Exercicios.ConsumindoAPI.ExerciciosAula3.ConsultaAPIGitHub;

import Exercicios.ConsumindoAPI.ExerciciosAula3.ConsultaAPIGitHub.Excecao.UsuarioNaoEncontradoException;
import Exercicios.ConsumindoAPI.ExerciciosAula3.Excecao.ConsultaAPIGitHub.UsuarioNaoEcontradoException;

public class Usuario {
    private String nome;

    private String id;

    private String imagem;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Usuario(MapeaConsulta consulta) {
        this.nome = consulta.login();
        this.id = consulta.id();
        this.imagem = consulta.avatar_url();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }


}
