import Modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Star Wars III");
        meuFilme.setAnoLancamento(1998);
        meuFilme.setSomaDasAvaliacoes(8.0);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.setIncluidoPlano(true);

        meuFilme.avalia(12);
        meuFilme.avalia(10);
        meuFilme.avalia(10);

        meuFilme.exibeInformacoes();
        System.out.println("Número total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Soma das avaliações: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("Media das avaliações: " + meuFilme.retornaMedia());
    }
}