package br.com.alura.screenmatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(@JsonAlias("Season") Integer temporada,
                             @JsonAlias("totalSeasons") Integer totalTemporadas,
                             @JsonAlias("Episodes") List<DadosEpisodios> dadosEpisodios) {

    /*
    @Override
    public String toString() {
        return "\nTemporada: " + temporada +
                "\n" +
                "\nEpisódios: " + dadosEpisodios;
    }

     */
}
