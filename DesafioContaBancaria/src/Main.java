import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
       String nome = "Gabriel";
       String tipoConta = "corrente";
       double saldo = 2000.00;

        System.out.println("------------------------");
        System.out.println("Cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("------------------------");

        int escolha = 0;

        while (escolha != 4) {
            System.out.println("\n 1 - Saldo");
            System.out.println(" 2 - Saque");
            System.out.println(" 3 - Depósito");
            System.out.println(" 4 - Sair");
            System.out.println("- Escolha uma opção: ");
            escolha = read.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("- Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("- Informe o valor do saque: ");
                    double saque = read.nextDouble();

                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente para a operação." +
                                            "\n Saldo atual: " + saldo);
                    } else if (saque == 0) {
                        System.out.println("O valor de saque deve ser maior que 0.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso. " +
                                            "\n Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("- Informe o valor do depósito: ");
                    double deposito = read.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("O valor de depósito deve ser maior que 0.");
                    } else {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso. " +
                                            "\n Saldo atual: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Fim do programa.");
                    break;
            }

        }

    }
}