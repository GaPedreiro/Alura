package Exercicios.Musica;

public class Main {
    public static void main(String[] args) {
        Musica novaMusica = new Musica();

        novaMusica.titulo = "Tompkins SquarePark";
        novaMusica.artista = "Mumford And Sons";
        novaMusica.anoLancamento = 2013;

        novaMusica.exibeFicaTecnica();

        novaMusica.avaliaMusica(5);
        novaMusica.avaliaMusica(5);
        novaMusica.avaliaMusica(10);

        System.out.println("Média de avaliações da música: " + novaMusica.mediaAvaliacoes());
    }
}
