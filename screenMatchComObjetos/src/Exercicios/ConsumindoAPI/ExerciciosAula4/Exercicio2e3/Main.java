package Exercicios.ConsumindoAPI.ExerciciosAula4.Exercicio2e3;
/*
Defina uma classe chamada Titulo com os atributos necessários.
Em seguida, crie um programa que instancia um objeto Titulo, serializa esse
objeto para JSON usando a biblioteca Gson e imprime o resultado.
 */


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        System.out.println("Digite o nome do filme: ");
        String nome = read.next();

        System.out.println("Digite a duração do filme: ");
        int duracao = read.nextInt();

        Titulo titulo = new Titulo(nome, duracao);
        String tituloJson = gson.toJson(titulo);

        System.out.println(titulo);
        System.out.println(tituloJson.toString());

    }
}
