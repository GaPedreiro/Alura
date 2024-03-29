package br.com.alura.screenmatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // Isso aqui serve pra que, caso o json de resposta da consulta contenha algum campo que não foi mapeado, esse campo é ignorado.
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
    /*
    Foi utilizado o Record porque não vamos precisar criar métodos. Essa classe foi criada para transformar o json resultante da consulta das séries em um objeto.
    Repare que não usamos como atributo o verdadeiro nome do campo que vem no json, o nome verdadeiro está em inglês, como TITLE, ao invés de título,
    a função do @JsonAlias é justamente dizer ao programa que o campo title do json se refere ao titulo.
    */


    @Override
    public String toString() {
        return "\nDados gerais. " +
                "\nTítulo: " + titulo +
                "\nTotal de temporadas: " + totalTemporadas +
                "\nNota geral: " + avaliacao;
    }
}
