package Principal;

import Modelos.Titulo;
import Modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import Excecao.ErroDeConversaoDeAnoException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner read = new Scanner(System.in);
        System.out.println("- Digite o nome de um filme: ");
        var busca = read.nextLine(); // O var tipa a variáveld e acordo com o que ela recebe, como se criasse ela sem tipo algum e de acordo com o que ela recebesse, seria definido seu tipo.
        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=d1fb1433"; // A função do replace é substituir o espaço em branco no nome do filme por um símbolo de adição, informando ao programa que a segunda palavra passada no nome do filme, faz parte do nome dele.

        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder() //Criando a reqquisição e passando endereço.
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client  //Armazenando a resposta da requisição.
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //System.out.println(response.body()); A resposta da requisição possui um corpo, que é o que vem no JSON, por isso colocamos o ".body" alí.

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);

            //try {
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Título já convertido: ");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Existe um erro no endereço, verifique!");
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Deu merda e não sei o que é."); // Opção genérica para tratar erros, Exception é a classe mãe das exceptions.
        }

        System.out.println("Programa finalizado");
    }
}
