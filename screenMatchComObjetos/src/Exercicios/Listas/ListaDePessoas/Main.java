package Exercicios.Listas.ListaDePessoas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(23);
        pessoa.setName("Camila Martins");
        pessoas.add(pessoa);

        Pessoa outraPessoa = new Pessoa();
        outraPessoa.setIdade(25);
        outraPessoa.setName("Gabriel Ramos");
        pessoas.add(outraPessoa);

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("Nome: " + pessoas.get(i).getName() +
                    "\nIdade: " + pessoas.get(i).getIdade());
        }
    }
}
