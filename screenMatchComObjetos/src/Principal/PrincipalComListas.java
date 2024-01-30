package Principal;

import Modelos.Filme;
import Modelos.Serie;
import Modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Star Wars III", 1998);
        meuFilme.avalia(7);
        Filme outroFilme = new Filme("Star Wars IV", 1998);
        outroFilme.avalia(8);
        var filmeDoGabriel = new Filme("A vida Secreta de Walter Mitty", 2013);
        filmeDoGabriel.avalia(10);
        Serie minhaSerie = new Serie("True Detetive", 2023);
        minhaSerie.avalia(9);

        List<Titulo> lista = new LinkedList<>();

        /*
        A classe LinkedList fornece uma lista encadeada de elementos.
        Diferentemente do ArrayList, que é baseado em um array, o LinkedList é baseado em uma lista
        encadeada, o que significa que cada elemento da lista é um objeto que contém uma referência
        para o próximo elemento. Isso permite que os elementos sejam adicionados e removidos de maneira
        eficiente em qualquer posição da lista, mas pode tornar a pesquisa de um elemento específico
        menos eficiente.

        O LinkedList é uma boa escolha quando a inserção e remoção de elementos em qualquer posição
        da lista é frequente e quando não é necessário acessar os elementos de forma aleatória.
         */

        lista.add(filmeDoGabriel);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(minhaSerie);

        // Uma forma de percorrer a lista com FOREACH.

        for (Titulo item: lista) { // Leia-se: Para cada variável ITEM que esteja dentro de LISTA, faça:
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) { // AQUI EU ESTOU VERIFICANDO O TIPO DE ITEM, SE ELE É MESMO UM OBJETO DE FILME.
                System.out.println("- classificação: " + filme.getClassificacao());
            }
        }


        // Outra forma de utilizar o forEach.
        // lista.forEach(item -> System.out.println(item));

        // Ordenando listas.

        List<String> buscaPorArtista = new ArrayList<>();

        System.out.println("----------------------------------");
        buscaPorArtista.add("Gabriel Ramos");
        buscaPorArtista.add("Camila Martins");
        System.out.println(buscaPorArtista);
        System.out.println("----------------------------------");

        Collections.sort(buscaPorArtista);

        System.out.println("Lista após a ordenação: ");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de títulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano de lançamento: ");
        System.out.println(lista);
    }
}
