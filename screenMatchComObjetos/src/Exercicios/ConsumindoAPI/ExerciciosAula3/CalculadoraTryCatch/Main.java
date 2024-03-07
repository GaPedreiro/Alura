package Exercicios.ConsumindoAPI.ExerciciosAula3.CalculadoraTryCatch;

import Exercicios.ConsumindoAPI.ExerciciosAula3.CalculadoraTryCatch.Excecao.ErroDeDivisaoPorZeroException;

import java.util.Scanner;

/*
Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro
pelo segundo. Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário
informe 0 como divisor.
 */

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = read.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = read.nextDouble();

        if (n2 == 0) {
            throw new ArithmeticException();
        }

        /* Não funcionou como o experado, a divisão por 0 não apresenta mais erro, agora apresenta
        um resultado "Infinity", por isso o catch não funciona, não cai nele, botando o if aqui deu
        pra pegar o erro.
         */

        try {
            double divisao = (n1 / n2);
            System.out.println("O resultado da divisão é: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível realizar a divisão por 0.");
        }




    }
}
