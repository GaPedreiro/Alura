package Exercicios.ConsumindoAPI.ExerciciosAula3.ValidacaoDeSenha;

public class Senha {
    private String senha;

    public Senha(String senha) {

        if (senha.length() < 8) {
            throw new RequisitoSenhaException("A senha deve conter ao menos 8 caracteres.");
        }

        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
}
