package Exercicios.Listas.Produtos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtoList = new ArrayList<>();
        Produto produto1 = new Produto("Manga", 9.99, 100);
        Produto produto2 = new Produto("Abacaxi", 8.75, 50);
        Produto produto3 = new Produto("Uva", 4.50, 200);
        Produto produto4 = new ProdutoPerecivel("Leite", 5, 70, "10-02-2024");

        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);
        produtoList.add(produto4);

        System.out.println("Apresentando produto de índice 0: ");
        System.out.println(produtoList.get(0));

        System.out.println("Apresentando produto de índice 1: ");
        System.out.println(produtoList.get(1));

        System.out.println("Apresentando produto de índice 2: ");
        System.out.println(produtoList.get(2));

        System.out.println("Apresentando produto de índice 3: ");
        System.out.println(produtoList.get(3));

        System.out.println("Apresentando todos os produtos com toString: ");
        System.out.println(produtoList.toString());

        }
    }
