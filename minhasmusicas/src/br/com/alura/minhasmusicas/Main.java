package br.com.alura.minhasmusicas;

import br.com.alura.minhasmusicas.Modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.Modelos.Musica;
import br.com.alura.minhasmusicas.Modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        // Música

        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Bohemiam Rapsody");
        minhaMusica.setArtista("Fredy Mercury");

        for (int i = 0; i < 701; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 500; i++) {
            minhaMusica.curte();
        }

        // Podcast

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Gabriel");
        meuPodcast.setConvidado("Tim Maia");

        for (int i = 0; i < 150; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 501; i++) {
            meuPodcast.curte();
        }

        // Preferidas

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();

        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPodcast);

    }
}