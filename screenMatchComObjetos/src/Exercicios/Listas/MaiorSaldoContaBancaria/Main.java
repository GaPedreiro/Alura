package Exercicios.Listas.MaiorSaldoContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double maior;


        ContaBancaria conta1 = new ContaBancaria(100288, 5000.00);
        ContaBancaria conta2 = new ContaBancaria(100289, 15150.00);
        ContaBancaria conta3 = new ContaBancaria(100290, 500.75);

        List<ContaBancaria> contas = new ArrayList<>();

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        ContaBancaria contaMaiorSaldo = contas.get(0);

        for (ContaBancaria item: contas) {
            if (item.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = item;
            }
        }

        System.out.println("Conta bancária com maior saldo: " + contaMaiorSaldo.getNumeroDaConta() +
                "\nSaldo atual: " + contaMaiorSaldo.getSaldo());

    }
}
