package Exercicios.ConsumindoAPI.ExerciciosAula3.ValidacaoDeSenha;

public class RequisitoSenhaException extends RuntimeException{
    public String mensagem;
    public RequisitoSenhaException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
