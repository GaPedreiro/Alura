package br.com.alura.screenmatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons")Integer totalTemporadas,
                         @JsonAlias("imbdRating")String avaliacao) {
    /*
    Foi utilizado o Record porque não vamos precisar criar métodos. Essa classe foi criada para transformar o json resultante da consulta das séries em um objeto.
    Repare que não usamos como atributo o verdadeiro nome do campo que vem no json, o nome verdadeiro está em inglês, como TITLE, ao invés de título,
    a função do @JsonAlias é justamente dizer ao programa que o campo title do json se refere ao titulo.
    */

}
