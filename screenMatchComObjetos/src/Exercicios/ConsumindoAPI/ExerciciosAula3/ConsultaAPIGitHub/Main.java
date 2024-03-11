package Exercicios.ConsumindoAPI.ExerciciosAula3.ConsultaAPIGitHub;

/*
Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub
(utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende RuntimeException.
Lance essa exceção quando o nome de usuário não for encontrado. No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.

 https://api.github.com/users/
 */

import Exercicios.ConsumindoAPI.ExerciciosAula3.ConsultaAPIGitHub.Excecao.UsuarioNaoEncontradoException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

            String json = response.body();

            Gson gson = new GsonBuilder().create();

            MapeaConsulta usuarioFormatado = gson.fromJson(json, MapeaConsulta.class);
            /*
            Aqui o MapeaConsulta não é uma classe, mas sim um Record que eu criei.
            ele funciona como uma classe as vezes, a gente consegue criar um objeto do tipo
            dele, mas para isso temos que montar um construtor para ele dentro da classe: Usuário.
             */

            System.out.println("\nJSON formatado: ");
            System.out.println("\n" + usuarioFormatado);


        } catch (UsuarioNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

    }
}
