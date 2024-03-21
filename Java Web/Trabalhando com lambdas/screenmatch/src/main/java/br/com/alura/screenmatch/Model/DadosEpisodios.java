package br.com.alura.screenmatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodios(@JsonAlias("Title") String titulo,
                             @JsonAlias("Episode") Integer numeroEpisodio,
                             @JsonAlias("imdbRating") String avaliacao,
                             @JsonAlias("Released") String dataLancamento) {

    @Override
    public String toString() {
        return  "\nEpisódio número: " + numeroEpisodio +
                "\nTítulo: " + titulo +
                "\nNota: " + avaliacao  +
                "\nData de lançamento: " + dataLancamento +
                "\n";
    }
}
