public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes = 0;
    int duracaoEmMinutos;

    void exibeInformacoes() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double retornaMedia() {
        double media = (somaDasAvaliacoes / totalAvaliacoes);
        return media;
    }
}
