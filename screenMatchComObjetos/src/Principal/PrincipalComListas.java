package Principal;

import Modelos.Filme;
import Modelos.Serie;
import Modelos.Titulo;

import java.util.ArrayList;

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

        ArrayList<Titulo> lista = new ArrayList<>();
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
    }
}
