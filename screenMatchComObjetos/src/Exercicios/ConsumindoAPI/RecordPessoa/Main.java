package Exercicios.ConsumindoAPI.RecordPessoa;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
Crie uma classe Pessoa usando o conceito de Record em Java,
com atributos como nome, idade e cidade. Em seguida, implemente
um programa que utiliza a biblioteca Gson para converter um JSON
representando uma pessoa em um objeto do tipo Pessoa.
 */
public class Main {
    public static void main(String[] args) {
        String json = """
          {
            "Name" : "Camila",
            "Age" : 24,
            "Hair" : "curly",
            "Height" : 1.60
            
          }
        """;

        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        //Gson gson = new Gson(); // Também poderia ser feito dessa forma, alí está diferente porque aplicamos um filtro de caracteres em maiúsculo que poderia vir no json, para tratar isso.

        //Gson gson = new GsonBuilder().setLenient().create(); // Isso aqui seria pra se caso houvessem campos a menos no json do que na Classe, porém não funcionou.

        MapeaPessoa mapeaPessoa = gson.fromJson(json, MapeaPessoa.class);
        System.out.println(mapeaPessoa);

        System.out.println("\nApós a conversão: ");

        Pessoa pessoa = new Pessoa(mapeaPessoa.name(), mapeaPessoa.age(), mapeaPessoa.height());

        System.out.println(pessoa);
    }


}
