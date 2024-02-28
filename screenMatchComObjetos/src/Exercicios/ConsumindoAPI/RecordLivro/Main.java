package Exercicios.ConsumindoAPI.RecordLivro;
/*
Crie uma classe Livro que contenha atributos como título, autor e um objeto representando
a editora. Em seguida, implemente um programa que utiliza a biblioteca Gson para converter
um JSON aninhado representando um livro em um objeto do tipo Livro.
 */

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();

        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto livro: " + livro);
    }
}
