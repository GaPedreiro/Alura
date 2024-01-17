package Exercicios.Musica;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numeroAvaliacoes;

    void exibeFicaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliaMusica(int nota) {
        avaliacao += nota;
        numeroAvaliacoes++;
    }

    int mediaAvaliacoes() {
        return avaliacao / numeroAvaliacoes;
    }
}
