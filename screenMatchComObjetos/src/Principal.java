import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Star Wars III";
        meuFilme.anoLancamento = 1998;
        meuFilme.somaDasAvaliacoes = 8.0;
        meuFilme.duracaoEmMinutos = 120;
        meuFilme.incluidoPlano = true;
        meuFilme.totalAvaliacoes = 16;

        meuFilme.avalia(12);
        meuFilme.avalia(10);
        meuFilme.avalia(10);

        meuFilme.exibeInformacoes();
        System.out.println("Soma das avaliações: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Media das avaliações: " + meuFilme.retornaMedia());
    }
}