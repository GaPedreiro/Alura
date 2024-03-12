package Exercicios.ConsumindoAPI.ExerciciosAula4.Exercicio4;

/*
Defina uma classe chamada Veiculo com os atributos necessários.
Em seguida, crie um programa que instancia um objeto Veiculo, serializa esse
objeto para JSON usando a biblioteca Gson e imprime o resultado.
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("Digite o modelo do carro: ");
        String modelo = read.next();
        System.out.println("Digite o ano do carro: ");
        int ano = read.nextInt();
        System.out.println("Digite a cor do carro: ");
        String cor = read.next();
        System.out.println("O carro é flex? ");
        String flex = read.next();

        Carro carro = new Carro(modelo, ano, cor, flex);

        String carroJson = gson.toJson(carro);

        System.out.println(carro);
        System.out.println("\nConversão dos dados do veículo para JSON: ");
        System.out.println("\n" + carroJson.toString());

        // Armazenando os dados do carro em um arquivo JSON só de zoas.

        FileWriter writer = new FileWriter("carro.json");

        writer.write(carroJson);
        writer.close();
    }
}
