package Principal.Aula5;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    public Endereco buscaEndereco(String cep) {
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível localizar o endereço a partir do CEP informado.");
        }

        return new Gson().fromJson(response.body(), Endereco.class);
    }
}
