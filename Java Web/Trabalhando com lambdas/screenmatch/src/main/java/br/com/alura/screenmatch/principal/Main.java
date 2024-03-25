package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.Model.DadosSerie;
import br.com.alura.screenmatch.Model.DadosTemporada;
import br.com.alura.screenmatch.Service.ConsumoAPI;
import br.com.alura.screenmatch.Service.ConverteDados;
import br.com.alura.screenmatch.Service.IConverteDados;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        System.out.println(temporadasList);
    }
}
