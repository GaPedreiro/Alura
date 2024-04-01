package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.Model.DadosEpisodios;
import br.com.alura.screenmatch.Model.DadosSerie;
import br.com.alura.screenmatch.Model.DadosTemporada;
import br.com.alura.screenmatch.Service.ConsumoAPI;
import br.com.alura.screenmatch.Service.ConverteDados;
import br.com.alura.screenmatch.Service.IConverteDados;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private final String ENDERCO = "https://www.omdbapi.com/?t=";
    //O final aqui tem o papel de informar que elas serão constantes, não vamo alterá-las em nenhum outro momento do código.
    private final String API_KEY = "&apikey=d1fb1433";
    /*
    Instanciamos a classe ConsumoAPI aqui fora do método porque ele será uma constante em nosso método,
    então aqui ele fica decalrado somente uma única vez.

    A nomenclatura das constantes deve ser clara e descritiva, utilizando letras maiúsculas e separando
    as palavras por underscore (_). Além disso, é uma boa prática declarar as constantes como static caso
    elas pertençam a uma classe e sejam compartilhadas por vários objetos. Dessa forma, as constantes
    podem ser acessadas diretamente através do nome da classe, sem a necessidade de instanciar um objeto.

     */
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private IConverteDados conversor = new ConverteDados();
    public void exibeMenu() {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o nome da série para busca: ");
        String nomeSerie = read.nextLine();
        var json = consumoAPI.obterDados( ENDERCO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dadosSerie);

        List<DadosTemporada> temporadasList = new ArrayList<>();

        for (int i = 1; i < dadosSerie.totalTemporadas(); i++) {
            json = consumoAPI.obterDados( ENDERCO + nomeSerie.replace(" ", "+") + "&Season=" + i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadasList.add(dadosTemporada);
            // Por algum motivo, quando deixamos a saída dos dados aqui dentro, ele printa duas vezes o primeiro elemento da lista.
        }
        //System.out.println(temporadasList); //Printa a lista

        /*
        //Nesse exemplo de código aqui, será printado o nome de todos os episódios da série.
        temporadasList.forEach(t -> t.dadosEpisodios()
                .forEach(e -> System.out.println(e.titulo())));

         */

        //Aqui estamos armazenando os dados dos episódios em uma lista.

        List<DadosEpisodios> dadosEpisodiosList = temporadasList.stream()
                .flatMap(t -> t.dadosEpisodios().stream()) //O flatMap tem uma função muito parecida com o map. que é usado para transformar um dado, aqui nesse caso, estamos dizendo aqui que dentro de uma lista, teremos outra lista
                .collect(Collectors.toList());
                //.toList();  //O toList nos retorna uma lista imutável, não vamos poder alterá-la depois de criada. O collect nos retorna uma lista que posteriormente podemos editá-la.

        System.out.println("\nTOP 5 EPISÓDIOS: ");
        dadosEpisodiosList.stream() //Nessa altura aqui já temos a nossa lista e agora estamos ordenando ela, pedimos que a ordenação fosse feita através da nota no episódio, porém naturalmente ela seria uma ordem crescente, a funlção do .reversed() é ordenar ela de forma descrescente, do melhor episódio ao pior.
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A")) //Aqui stamos pedindo para que os eísódios cuja avaliação esteja como "N/A", para que esse episódio seja ignorado, pois ele não possuia uma nota.
                .sorted(Comparator.comparing(DadosEpisodios::avaliacao).reversed())
                .limit(5)
                .forEach(System.out::println);
    }
}
