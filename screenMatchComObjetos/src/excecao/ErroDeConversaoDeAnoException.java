package excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    /*
    Normalmente ele extende de Throwable, mas trocamos para RunTime para ser mais específico, pois é uma exceção muito específica que criamos.
     */
    public String mensagem;
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
