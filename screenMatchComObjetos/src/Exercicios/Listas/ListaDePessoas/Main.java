package Exercicios.Listas.ListaDePessoas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa = new Pessoa("Camila Martins", 23);
        pessoas.add(pessoa);

        Pessoa outraPessoa = new Pessoa("Gabriel Ramos", 25);
        pessoas.add(outraPessoa);

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i));
        }

        /* Outra forma de apresentar os dados:

        for (Pessoa pessoa1 : pessoas) {
            System.out.println(pessoa1);
        }

         */
    }
}
