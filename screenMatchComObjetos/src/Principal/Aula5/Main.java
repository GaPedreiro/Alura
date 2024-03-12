package Principal.Aula5;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.IllegalFormatException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ConsultaCep consulta = new ConsultaCep();
        String cep = "";

        while (!cep.equalsIgnoreCase("sair")) {
            System.out.println("\nConsulta de CEP. Digite 'sair' para encerrar o programa.");
            System.out.println("\nDigite o CEP: ");
            cep = read.next();

            try {
                Endereco endereco = consulta.buscaEndereco(cep);
                System.out.println(endereco);
                GeradorDeArquivo gerador = new GeradorDeArquivo();
                gerador.geraArquivoJson(endereco);

            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando o programa.");
            }
        }








    }
}
