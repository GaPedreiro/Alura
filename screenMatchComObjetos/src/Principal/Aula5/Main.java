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

        System.out.println("Digite o CEP: ");
        String cep = read.next();
        Endereco endereco = consulta.buscaEndereco(cep);

        System.out.println(endereco);




    }
}
