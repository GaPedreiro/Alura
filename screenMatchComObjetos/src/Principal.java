import Calculos.CalculadoraDeTempo;
import Calculos.FiltroDeRecomendacao;
import Modelos.Episodio;
import Modelos.Filme;
import Modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Star Wars III");
        meuFilme.setAnoLancamento(1998);
        meuFilme.setSomaDasAvaliacoes(8.0);
        meuFilme.setDuracaoEmMinutos(150);
        meuFilme.setIncluidoPlano(true);

        meuFilme.avalia(12);
        meuFilme.avalia(10);
        meuFilme.avalia(10);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Star Wars IV");
        outroFilme.setAnoLancamento(1998);
        outroFilme.setSomaDasAvaliacoes(8.0);
        outroFilme.setDuracaoEmMinutos(160);
        outroFilme.setIncluidoPlano(true);

        // Série

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("True Detetive");
        minhaSerie.setAnoLancamento(2023);
        minhaSerie.setTemporadas(4);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(60);

        // Listando informações

        meuFilme.exibeInformacoes();
        System.out.println("Número total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Soma das avaliações: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("Media das avaliações: " + meuFilme.retornaMedia());

        System.out.println("********************************" +
                "\nApresentado os dados da série, agora: ");
        System.out.println(minhaSerie.exibeInformacoes());
        System.out.println("Tempo para maratonar " + minhaSerie.getNome() + ": " + minhaSerie.getDuracaoEmMinutos());


        // Calculadora

        System.out.println("********************************");
        System.out.println("Calculadora de tempo: ");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println("Duração primeiro filme: " + meuFilme.getDuracaoEmMinutos());
        calculadora.inclui(outroFilme);
        System.out.println("Duração do segundo filme: " + outroFilme.getDuracaoEmMinutos());
        System.out.println("Tempo total da calculadora: " + calculadora.getTempoTotal());
        System.out.println("Adicionando o tempo de uma série junto: ");
        calculadora.inclui(minhaSerie);
        System.out.println("Duração da série: " + minhaSerie.getDuracaoEmMinutos());
        System.out.println("Tempo total da calculadora: " + calculadora.getTempoTotal());
        System.out.println("********************************");

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}