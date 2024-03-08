package Exercicios.ConsumindoAPI.ExerciciosAula3.ConsultaAPIGitHub.Excecao;

public class UsuarioNaoEncontradoException extends RuntimeException {

    //public String message;
    public UsuarioNaoEncontradoException(String message) {
        super(message);
    }

    /*
    @Override
    public String toString() {
        return this.message;
    }

     */
}
