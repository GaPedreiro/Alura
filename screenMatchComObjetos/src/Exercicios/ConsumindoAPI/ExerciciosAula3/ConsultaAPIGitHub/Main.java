package Exercicios.ConsumindoAPI.ExerciciosAula3.ConsultaAPIGitHub;

/*
Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub
(utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende RuntimeException.
Lance essa exceção quando o nome de usuário não for encontrado. No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.

 https://api.github.com/users/
 */

import Exercicios.ConsumindoAPI.ExerciciosAula3.ConsultaAPIGitHub.Excecao.UsuarioNaoEncontradoException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe o nome do usuário: ");
        Usuario usuario = new Usuario(read.nextLine());

        String endereco = new String("https://api.github.com/users/" + usuario);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new UsuarioNaoEncontradoException("Usuário não encontrado.");
            }

            System.out.println(response.body());

        } catch (UsuarioNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

    }
}
