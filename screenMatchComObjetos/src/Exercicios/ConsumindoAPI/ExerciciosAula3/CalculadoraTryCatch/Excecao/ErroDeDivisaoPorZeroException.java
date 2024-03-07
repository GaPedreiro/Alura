package Exercicios.ConsumindoAPI.ExerciciosAula3.CalculadoraTryCatch.Excecao;

public class ErroDeDivisaoPorZeroException extends RuntimeException {

    public String mensagem;
    public ErroDeDivisaoPorZeroException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
