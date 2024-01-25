package Exercicios.Listas.MaiorSaldoContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double maior;

        List<ContaBancaria> contas = new ArrayList<>();

        ContaBancaria conta1 = new ContaBancaria(100288, 5000.00);
        ContaBancaria conta2 = new ContaBancaria(100289, 15150.00);
        ContaBancaria conta3 = new ContaBancaria(100290, 500.75);

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        for (int i = 0; i < contas.size(); i++) {
            maior = contas.get(i).getSaldo();
            if (maior > contas.get(i+1).getSaldo() && maior > contas.get(i+2).getSaldo()) {
                System.out.println("A conta bancária com o mario saldo é: " + contas.get(i).getNumeroDaConta() +
                "\nSaldo atual: " + contas.get(i).getSaldo());
            }
        }

        // Não está funcionando, fazer com stream().
    }
}
