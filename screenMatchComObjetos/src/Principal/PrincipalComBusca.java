package Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder() //Criando a reqquisição e passando endereço.
                .uri(URI.create("https://www.omdbapi.com/?t=minions&apikey=d1fb1433"))
                .build();
        HttpResponse<String> response = client  //Armazenando a resposta da requisição.
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body()); //A resposta da requisição possui um corpo, que é o que vem no JSON, por isso colocamos o ".body" alí.
    }
}
