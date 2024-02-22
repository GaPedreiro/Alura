package Principal;

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
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=d1fb1433";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder() //Criando a reqquisição e passando endereço.
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client  //Armazenando a resposta da requisição.
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body()); //A resposta da requisição possui um corpo, que é o que vem no JSON, por isso colocamos o ".body" alí.

    }
}
