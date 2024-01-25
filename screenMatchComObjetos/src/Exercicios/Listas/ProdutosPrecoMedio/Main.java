package Exercicios.Listas.ProdutosPrecoMedio;

import Exercicios.Listas.ListaDePessoas.Pessoa;

import java.util.ArrayList;
import java.util.List;

/*
Crie uma classe Produto com propriedades como nome e preço.
Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir
o preço médio dos produtos.
 */

public class Main {
    public static void main(String[] args) {
        Produto cocaCola = new Produto("Coca-cola", 4.50);
        Produto amaciante = new Produto("Amaciante", 17.50);
        Produto cannabis = new Produto("Gorilla Glue", 20.00);

        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(cocaCola);
        listaProdutos.add(amaciante);
        listaProdutos.add(cannabis);

        System.out.println("Apresentando lista de produto cadastrados: " + listaProdutos.toString());

        int contador = 0;
        double media = 0;

        for (int i = 0; i < listaProdutos.size(); i++) {
            contador++;
            media += listaProdutos.get(i).getPreco();
        }

        media = media / contador;

        System.out.println("A média de preço dos produtos é de: R$" + media);

    }
}
