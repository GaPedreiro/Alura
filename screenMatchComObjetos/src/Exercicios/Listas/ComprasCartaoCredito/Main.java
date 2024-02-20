package Exercicios.Listas.ComprasCartaoCredito;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("- Informe o limite do cartão: ");
        double limite = read.nextDouble();

        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;

        while (sair != 0) {
            System.out.println("\n- Descrição da compra: ");
            String descricao = read.next();

            System.out.println("- Valor da compra: ");
            double valor = read.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("\n- Digite 1 para continuar ou 0 para sair: ");
                sair = read.nextInt();
            } else {
                System.out.println("-> Saldo insuficiente!");
                sair = 0;
            }

        }

        System.out.println("\n***********************");
        System.out.println("Compras realizadas: ");
        Collections.sort(cartao.getCompras());
        for (Compra item : cartao.getCompras()) {
            System.out.println("- " + item.getDescricao() + ", R$: " + item.getValor());
        }
        System.out.println("\n***********************");
        System.out.println("-> Saldo do cartão: " + cartao.getSaldo());
    }
}
